package generic.quiz;

public class GenericQuiz<T> {
    private T value;
    public static <U> T quizMethod(U t){
        return t;
    }

}
