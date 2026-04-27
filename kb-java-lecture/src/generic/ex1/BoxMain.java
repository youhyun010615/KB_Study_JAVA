package generic.ex1;

public class BoxMain {
    public static void main(String[] args) {
        IntegerBox intBox = new IntegerBox();
        intBox.setValue(27);

        System.out.println("IntegerBox value = " + intBox.getValue());

        StringBox strBox = new StringBox();
        strBox.setValue("Hello");

        System.out.println("StringBox value = " + strBox.getValue());
    }
}
