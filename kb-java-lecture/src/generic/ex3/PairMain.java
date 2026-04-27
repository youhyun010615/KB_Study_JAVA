package generic.ex3;

public class PairMain {
    public static void main(String[] args) {
        Pair<String, String> nameDate = new Pair<>("name", "권유현");
        Pair<String, Integer> ageDate = new Pair<>("age", 42);
        Pair<String, Boolean> marriedDate = new Pair<>("married", false);



        System.out.println("nameDate value : " + nameDate.getKey());
        System.out.println("ageDate value : " + ageDate.getKey());
        System.out.println("marriedDate value : " + marriedDate.getKey());

        System.out.println(nameDate);
        System.out.println(ageDate);
        System.out.println(marriedDate);
    }
}
