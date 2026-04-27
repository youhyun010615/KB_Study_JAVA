package exception.check;

public class Service {
    public static void main(String[] args) {
        Repository repo = new Repository();
        try {
            repo.callRandException();
        }catch (MyCheckException2 e){
            e.printStackTrace();
        }

    }
}
