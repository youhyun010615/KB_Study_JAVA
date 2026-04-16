package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String Line = scanner.nextLine();
        System.out.println("입려한 문자열은!? : " + Line);

        System.out.print("정수를 입력하세요. ");
        int num = scanner.nextInt();
        System.out.println("입력한 숫자는!? : " + num);

    }
}
