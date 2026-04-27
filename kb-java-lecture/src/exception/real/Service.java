package exception.real;

import exception.real.exception.MyCheckException;
import exception.real.exception.MyUncheckException;


public class Service {
    public static void main(String[] args) {
        Repository repo = new Repository();

        try{
            repo.callUnCheckException();
            repo.callUnCheckException();
        }catch(Exception e){
            exceptionHandler(e);
        }
        System.out.println("막았는가?");
    }

    public static void exceptionHandler(Exception e){
        System.out.println("시스템 : 죄송합니다. 알 수 없는 문제 발생");

        if (e instanceof MyCheckException){
            System.out.println("MyCheckException 발생!");
            MyCheckException exception = (MyCheckException) e;
            // MyCheckException 에 맞는 예외 처리
            exception.printStackTrace();

        }else if (e instanceof MyUncheckException){
            System.out.println("MyCheckException 발생!");
            MyUncheckException exception = (MyUncheckException) e;
            // MyCheckException 에 맞는 예외 처리
            exception.printStackTrace();
        }
    }
}
