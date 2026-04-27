package generic.ex2;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<Integer>();
        intBox.setValue(10);
        System.out.println("intBox value = " + intBox.getValue());

        GenericBox<String> strBox = new GenericBox<>();
        strBox.setValue("집 가고 싶다");
        System.out.println("StrBpx value = " + strBox.getValue());
    }
}
