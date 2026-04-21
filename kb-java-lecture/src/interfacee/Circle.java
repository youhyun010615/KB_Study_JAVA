package interfacee;

public class Circle implements Shape{
    private String color;
    private double radius;
    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;

    }

    @Override
    public double perimeter() {
        return radius * radius * PI;
    }

    @Override
    public double area() {
        return 2 * radius * PI;
    }

    public void printCircle(){
        System.out.println("색상 : " + this.color);
        printInfo(); 
    }


}
