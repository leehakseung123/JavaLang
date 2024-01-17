package CH16_EX;

import java.util.Scanner;
import java.util. InputMismatchException;       // 1.InputMismatchException을 위해 임포트

public class Ex02_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try
        {
            int num1 = sc.nextInt();        // 2. 에러 발생 지점
            int num2 = 10 / num1;           // 3. 에러 발생 지점
            System.out.println(num2);       // 4. 실행x
            System.out.println("Good bye~!");   //5. 2.부터 예외처리를 위해 try문의 중괄호로 묶었다. 이부분을 실행하다 예외 발생시 catch 문 실행
        }
        catch (ArithmeticException e)       // 6. 예외 처리, 3.에서 수학적인 처리에 대한 예외가 생기면 실행
        {
            String str = e.getMessage();       // 7. 예외에 대한 간단한 메시지를 문자열로 받아온다.
            System.out.println(str);
            if (str.equals("/ by zero"))
            {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }
        catch (InputMismatchException e)        // 8. 예외처리, 2.에서 입력값이 정수가 아니어서 데이터의 형변환에 대한 예외가 발생하면 실행
        {
            System.out.println(e.getMessage()); // 9.메시지를 얻어 출력
            //e.printStackTrace();              // 10. 예외에 대한 자세한 메시지를 출력
        }
    }
}
