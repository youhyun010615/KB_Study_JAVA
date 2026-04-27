package exception.unchkeck;

import exception.check.MyCheckException2;
import exception.unchkeck.Repository;

public class Service {
    public static void main(String[] args) {
        Repository repo = new Repository();

        try{
            repo.callUnCheckException();
        }catch(MyUncheckException e){
            e.printStackTrace();
        }
        System.out.println("막았는가?");
    }
}
