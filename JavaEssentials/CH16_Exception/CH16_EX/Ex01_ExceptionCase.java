package CH16_EX;

import java.util.Scanner;

public class Ex01_ExceptionCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();        // 1. 실행 예외는 개발자에게 판단과 처리를 맟긴다. 개발자가 처리를 안 한 경우자바 가상 머신은 예외가 발생할 시 프로그램을 안정적으로 종료시킨다.
        int num2 = 10 / num1;
        System.out.println(num2);

        // MyBook book1 = new MyBook();        // 2. 무조건 예외처리를 해주어야 한다.
    }
}
