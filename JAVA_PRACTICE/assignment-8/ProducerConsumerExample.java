import java.util.Random;

class Producer extends Thread {
    private final Random random;
    private final Consumer consumer;

    public Producer(Consumer consumer) {
        this.random = new Random();
        this.consumer = consumer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            synchronized (consumer) {
                consumer.setNumber(randomNumber);
                consumer.notify();
            }
            try {
                sleep(1000); // Sleep to simulate production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private int number;
    private int evenCount;

    public Consumer() {
        this.evenCount = 0;
    }

    public synchronized void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                try {
                    wait();
                    if (number % 2 == 0) {
                        evenCount++;
                    }
                    System.out.println("Received: " + number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Total even numbers received: " + evenCount);
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        Producer producer = new Producer(consumer);

        producer.start();
        consumer.start();
    }
}