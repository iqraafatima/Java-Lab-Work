
/*import java.util.Scanner;

// Interface
interface Shape {
    void draw();
    double getArea();
}

// Circle Class
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle Class
class Rectangle implements Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

// Triangle Class
class Triangle implements Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle...");
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main Class
public class ShapeManagement2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        int choice = sc.nextInt();

        Shape shape = null;

        switch (choice) {

            case 1:
                System.out.println("Input: Create a Circle with radius = ");
                double radius = sc.nextDouble();
                shape = new Circle(radius);
                break;

            case 2:
                System.out.println("Input: Create a Rectangle with width and height = ");
                double width = sc.nextDouble();
                double height = sc.nextDouble();
                shape = new Rectangle(width, height);
                break;

            case 3:
                System.out.println("Input: Create a Triangle with base and height = ");
                double base = sc.nextDouble();
                double h = sc.nextDouble();
                shape = new Triangle(base, h);
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        System.out.println("Area: " + shape.getArea());
        shape.draw();

        sc.close();
    }
}*/