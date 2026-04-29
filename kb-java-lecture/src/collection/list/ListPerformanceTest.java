package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListPerformanceTest {
    static final int SIZE = 100_000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new ArrayList<>();

        for (int i =0; i < SIZE; i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        // 조회 케이스
        long startTime = System.nanoTime();
        arrayList.get(SIZE / 2);
        long endTime =  System.nanoTime();
        System.out.println("ArrayList 마지막 노드 조회 시간 : " +  (endTime - startTime));

        startTime = System.nanoTime();
        linkedList.get(SIZE / 2);
        endTime =  System.nanoTime();
        System.out.println("LinkedList 마지막 노드 조회 시간 : " +  (endTime - startTime));


        startTime = System.nanoTime();
        arrayList.add(0, 1);
         endTime =  System.nanoTime();
        System.out.println("ArrayList 맨 앞 추가 시간 : " +  (endTime - startTime));

        startTime = System.nanoTime();
        linkedList.add(0, 1);
        endTime =  System.nanoTime();
        System.out.println("LinkedList 마지막 노드 조회 시간 : " +  (endTime - startTime));
    }
}
