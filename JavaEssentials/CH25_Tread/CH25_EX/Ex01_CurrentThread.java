package CH25_EX;

public class Ex01_CurrentThread {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();     // 1. 현재 스레드명을 구해온다.
        System.out.println("현재 스레드 이름 : " + name);      // 2. 출력해서 현재 스레드명을 확인해본다
    }
}
