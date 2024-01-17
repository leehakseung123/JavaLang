package CH16_EX;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex04_CatchConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try
        {
            int num1 = sc.nextInt();
            int num2 = 10 / num1;
            System.out.println(num2);
        }

        catch (ArithmeticException | InputMismatchException e)  // 1. 예외처리, 여러 Exception을 |를 이용해 지정
        {
            // System.out.println(e.getMessage());
            // e.printStackTrace();
            System.out.println("예외 발생");                    // 2. 모든 상황을 간단한 메시지로 한 번에 처리
        }
        System.out.println("Good Bye ~!");                       // 3. finally를 통하지 않더라도 try catch 문에 의해 비정상적인 종료 방지
    }
}
