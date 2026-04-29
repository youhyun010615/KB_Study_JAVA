package self_study.ch14;

public class GenericMethodExample <T>{

    public static <U> U staticMethod(U value){
        return value;
    }
}
