package langg.clazz;

public class ClazzMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz1 = User.class;
        Class clazz2 = new User("유현", "hello").getClass();
        Class clazz3 = Class.forName("langg.clazz.User");

        System.out.println(clazz1);
        System.out.println(clazz2);
        System.out.println(clazz3);
    }
}
