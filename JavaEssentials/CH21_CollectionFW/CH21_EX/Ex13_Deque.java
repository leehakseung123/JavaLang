package CH21_EX;

import  java.util.ArrayDeque;
import java.util.Deque;
public class Ex13_Deque {
    public static void main(String[] args) {


        // 둘 다 사용 가능
        Deque<String> deq = new ArrayDeque<>();  // 1. ArrayDeque로 객체를 만들고 Deque로 만든 참조 변수에 대입
//      Deque<String> deq = new LinkedList<>();  // 2. LinkedList로 객체를 만들고 Deque로 만든 참조 변수에 대입

        // 3. 앞으로 넣고, 자료구조는 스택이 된다.
        deq.offerFirst("A");
        deq.offerFirst("B");
        deq.offerFirst("C");

        // 앞에서 꺼내기
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());

        // 4. 뒤로 넣고, 자료구조는 스택이 된다.
        deq.offerLast("A");
        deq.offerLast("B");
        deq.offerLast("C");

        // 뒤에서 꺼내기
        System.out.println(deq.pollLast());
        System.out.println(deq.pollLast());
        System.out.println(deq.pollLast());

        System.out.println("-----------------------------------");

        // 5. 뒤로 넣고, 자료 구조는 스택이 된다.
        deq.offerLast("A");
        deq.offerLast("B");
        deq.offerLast("C");

        // 앞에서 꺼내기
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());

    }
}
