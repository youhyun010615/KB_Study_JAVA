package langg.equals;

public class EqualsMain {
    public static void main(String[] args) {
        User user1 = new User("권유현", "yuhi");
        User user2 = new User("권유현", "yuhi");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));

    }
}
