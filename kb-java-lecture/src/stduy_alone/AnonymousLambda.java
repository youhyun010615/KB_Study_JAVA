package stduy_alone;

interface Add{
    int operation(int a, int b);
}

public class AnonymousLambda {
    public static void main(String[] args) {

        Add add = (a, b) -> a + b;

        System.out.println(add.operation(10, 10));

    }
}
