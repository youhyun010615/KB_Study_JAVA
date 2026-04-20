package polymorphism;

public class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("맥아뇽");
    }

    public void grooming(){
        System.out.println("고양이는 스스로를 그루밍 합니다. 나 이뻐!?");

    }
}
