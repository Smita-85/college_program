//QUESTION-3
import java.util.Scanner;

class VectorMultiplier extends Thread {
    private final int[] vector1;
    private final int[] vector2;
    private final int[] resultVector;
    private final int startIndex;
    private final int increment;

    public VectorMultiplier(int[] vector1, int[] vector2, int[] resultVector, int startIndex, int increment) {
        this.vector1 = vector1;
        this.vector2 = vector2;
        this.resultVector = resultVector;
        this.startIndex = startIndex;
        this.increment = increment;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < vector1.length; i += increment) {
            resultVector[i] = vector1[i] * vector2[i];
        }
    }
}

   class VectorProductMultiThreading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the vectors: ");
        int size = scanner.nextInt();

        int[] vector1 = new int[size];
        int[] vector2 = new int[size];
        int[] resultVector = new int[size];

        System.out.println("Enter elements of first vector:");
        for (int i = 0; i < size; i++) {
            vector1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements of second vector:");
        for (int i = 0; i < size; i++) {
            vector2[i] = scanner.nextInt();
        }

        VectorMultiplier oddMultiplier = new VectorMultiplier(vector1, vector2, resultVector, 1, 2);
        VectorMultiplier evenMultiplier = new VectorMultiplier(vector1, vector2, resultVector, 0, 2);

        oddMultiplier.start();
        evenMultiplier.start();

        try {
            oddMultiplier.join();
            evenMultiplier.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Resultant vector after multiplication:");
        for (int i = 0; i < size; i++) {
            System.out.print(resultVector[i] + " ");
        }
    }
}