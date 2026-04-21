package interfacee;

public interface Shape {
    public static final double PI = 3.14;

    double area(); //interface에서는 public abstract는 자동으로 추가 된다. 위랑 아래랑 같음
    public abstract double perimeter();


    default void printInfo(){
        System.out.println("넓이 : " + area());
        System.out.println("둘레 : " + perimeter());
    }
}
