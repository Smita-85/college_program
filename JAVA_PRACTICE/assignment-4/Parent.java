abstract class Figure {
    abstract double area();
}

class Circle extends Figure {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Figure {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Figure {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

 class Parent{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(4, 7);
        Rectangle rectangle = new Rectangle(6, 8);
    }
}







