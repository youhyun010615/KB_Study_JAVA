package self_study.ch14;

import java.security.spec.RSAOtherPrimeInfo;

public class GenericMethodExampleMain {
    public static void main(String[] args) {

        String result = GenericMethodExample.staticMethod("gello");
        Integer inte = GenericMethodExample.staticMethod(20);


        System.out.println(result);
        System.out.println(inte);
    }
}
