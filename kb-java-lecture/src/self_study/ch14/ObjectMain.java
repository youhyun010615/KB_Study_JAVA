package self_study.ch14;

public class ObjectMain {
    public static void main(String[] args) {
        ObjectBox objBox = new ObjectBox();

        objBox.setObj("serset");

        Integer value = (Integer) objBox.getObj();
        System.out.println(value);
    }
}
