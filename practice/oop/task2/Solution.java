package practice.oop.task2;

public class Solution {
    public static void main(String[] args) {
        Figure one = new Rectangle(4.5, 5);
        Figure two = new Circle(4.2);
        Figure three = new Triangle(3, 4, 5);
        System.out.println(one.calculateArea());
        System.out.println(two.calculateArea());
        System.out.println(three.calculateArea());
    }
}

class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle extends Figure {
    private double radius;

    public Circle(double radius) { this.radius = radius; }

    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public double calculateArea(){ return Math.PI * radius * radius; }
}

class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private double halfPerimeter;
    
    public Triangle(double a, double b, double c) {
        try {
            sideA = a;
            sideB = b;
            sideC = c;
            halfPerimeter = (sideA + sideB + sideC) / 2;
            if (sideA + sideB < sideC ||
                sideA + sideC < sideB ||
                sideB + sideC < sideA ||
                sideA == 0 ||
                sideB == 0 ||
                sideC == 0) {
                throw new TriangleSidesDoNotCorrespondToBasicMath("One of the sides exceeds the sum of the other two, which breaks basic laws of math. We don't do that here. Try again.");
            }
        }
        catch (TriangleSidesDoNotCorrespondToBasicMath ex) {
            System.err.println("Detected attempted breach of basic mathematical laws.");
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public double calculateArea() {
        // Heron's formula
        return Math.sqrt(
            halfPerimeter * 
            (halfPerimeter - sideA) * 
            (halfPerimeter - sideB) * 
            (halfPerimeter - sideC)
            );
    }
}

class TriangleSidesDoNotCorrespondToBasicMath extends Exception {
    public TriangleSidesDoNotCorrespondToBasicMath(String s) {
        super(s);
    }
}

abstract class Figure {
    public abstract double calculateArea();
}