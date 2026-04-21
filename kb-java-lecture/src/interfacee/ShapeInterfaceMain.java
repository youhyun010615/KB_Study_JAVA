package interfacee;

import interfacee.Rectangle;

public class ShapeInterfaceMain {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle("orange", 10, 10);
        Circle circle = new Circle("skyblue", 3);

        rec.printInfo();
        rec.printRectangle();

        System.out.println();

        circle.printInfo();
        circle.printCircle();
    }
}
