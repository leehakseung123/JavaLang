package CH21_EX;

import java.util.LinkedList;
import java.util.Queue;

public class Ex12_Queue {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();     // 1. LinkedList로 객체를 만들고 Queue로 만든 참조 변수에 대입
        // LinkedList로 객체로 만들고 Queue로 만든 참조 변수에 대입해주고 있다.

        //2. 데이터 저장, 큐에 객체를 저장
        que.offer("A");
        que.offer("B");
        que.offer("C");
        System.out.println(que.size());

        // 3. 무엇이 다음에 나올지 확인
        System.out.println("next : " + que.peek());
        //첫 번쨰 객체 꺼내기
        System.out.println(que.poll());
        System.out.println(que.size());

        // 4. 무엇이 다음에 나올지 확인, 큐에서 실제로 객체를 꺼내서 사용
        System.out.println("next : " + que.peek());
        //두 번째 객체 꺼내기
        System.out.println(que.poll());
        System.out.println(que.size());

        // 무엇이 다음에 나올지 확인
        System.out.println("next : " + que.peek());
        //마지막 객체 꺼내기
        System.out.println(que.poll());
        System.out.println(que.size());
    }
}
