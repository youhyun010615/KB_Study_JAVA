package self_study.ch14;



public class GenericMain {
    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>();

        intBox.setValue(190);
        System.out.println(intBox.getValue());

        GenericBox<String> strBox = new GenericBox<>();

        strBox.setValue("gello");
        System.out.println(strBox.getValue());

    }
}
