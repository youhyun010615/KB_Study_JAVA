package type;

public class commit {
    int [] count = { 1,2,3};
    String [] message = {
            "나는 오늘 커밋을 하기 위해서 들어왔습니다.",
            "오늘은 여자친구와 함께 호수 공원에 다녀왔습니다.",
            "떡복이 김밥 샌드위치에 아메리카노까지 먹었어요."

    };

    public void TodoList(){
        System.out.println("오늘 당신의 TodoList 입니다.");
        System.out.println("------------------------");

        for(int i = 0; i < count.length; i++){
            System.out.println(count[i] + " : " + message[i]);
        }
    }

}
