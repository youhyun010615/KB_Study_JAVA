package classs;

public class FishBreadMain {
    public static void main(String[] args) {
        FishBread fish1 = new FishBread("팥", "잉어", 33333);
        FishBread fish2 = new FishBread();


        System.out.println("fish1");
        System.out.println(fish1.taste);
        System.out.println(fish1.shape);
        System.out.println(fish1.price);
        System.out.println(fish1.makeTime);

        System.out.println("----------------");
        System.out.println("fish2");
        System.out.println(fish2.taste);
        System.out.println(fish2.shape);
        System.out.println(fish2.price);
        System.out.println(fish2.makeTime);

    }
}

