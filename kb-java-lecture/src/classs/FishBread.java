package classs;


import java.util.Date;

public class FishBread {
    String taste = "팥";
    String shape = "붕어";
    int price = 666;
    Date makeTime = new Date();

    FishBread(){};

    FishBread(String taste, String shape, int price){
        this.taste = taste;
        this.shape = shape;
        this.price = price;
    }
    void printFishbread(){
        System.out.println(this.taste);
        System.out.println(this.shape);
        System.out.println(this.price);
        System.out.println(this.makeTime);

    }
}
