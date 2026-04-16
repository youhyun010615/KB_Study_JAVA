package scanner;

import java.util.Random;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int rand_num = random.nextInt(100);
        int num = -1;

        do{
            System.out.print("랜덤 숫자를 입력하세요 : ");
            num = sc.nextInt();

            if(num > rand_num){
                System.out.println("DOWN");
            } else if (num < rand_num) {
                System.out.println("UP");
            }

        }while(rand_num != num);

        System.out.println("정답입니다! 랜덤 숫자는 " + num);

    }
}
