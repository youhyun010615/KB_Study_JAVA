package exception.basic;

public class ExceptionCatch {
    public static void main(String[] args) {
        try{
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[5]);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("이것도 나오냐요");
        }
        System.out.println("나오나요?");
    }
}
