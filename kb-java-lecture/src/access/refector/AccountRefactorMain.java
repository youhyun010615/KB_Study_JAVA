package access.refector;

public class AccountRefactorMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("토스", "다이아", "김수현", 100000000);

        System.out.println("public 요소 접근");
        System.out.println("은행명은? : "+account.bank);

        System.out.println();

        System.out.println("default 요소 접근 ");
        System.out.println("회원 등급은? : " + account.grade);

        System.out.println();

        System.out.println("private 요소 접근");
        System.out.println("계좌 소유주는? : " );

        account.print();
    }
}
