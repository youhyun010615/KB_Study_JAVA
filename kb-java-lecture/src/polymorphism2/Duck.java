package polymorphism2;

public class Duck extends Animal{
    @Override
    public void sound(){
        System.out.println("오리는 꽤꽥");
    }

    public void fly(){
        System.out.println("오리 날다!");
    }
}
