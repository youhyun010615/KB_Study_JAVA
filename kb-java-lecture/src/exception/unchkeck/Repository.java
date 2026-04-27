package exception.unchkeck;

import exception.check.MyCheckException;
import exception.check.MyCheckException2;

import java.util.Random;

public class Repository {
    public void callUnCheckException()  {
        boolean con = false;

        // DB 관련 통신 작업
        if (!con) throw new MyUncheckException("Repository DB 작업에서 예외 발생");

        // 원하던 작업을 수행

    }
}
