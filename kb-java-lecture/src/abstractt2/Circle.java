package abstractt2;

import abstractt.Shape;



public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double area() {

        return radius * radius * PI;
    }
}
