package CH16_EX;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex09_ThrowsInMethod {
    public static void myMethod1()      // 1. 예외가 발생한다.
    {
        myMethod2();
    }

    public static void myMethod2()
        throws ArithmeticException, InputMismatchException  // 2.예외가 발생한다는 것을 보여준다.
    {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();          // 에러 발생 지점
        int num2 = 10 / num1;              // 에러 발생 지점
        System.out.println(num2);
    }

    public static void main(String[] args) {
        try
        {
            myMethod1();
        }
        catch (ArithmeticException | InputMismatchException e)
        {
            e.printStackTrace();
        }
        System.out.println("-------------");
    }
}
