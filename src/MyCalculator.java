import java.util.Scanner;   // 입력 처리 클래스

public class MyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력 처리 객체

        while (true)
        {
            showMenu();             // 메뉴 출력

            //int num = sc.nextInt();      기존 입력코드
            char myChar = sc.nextLine().charAt(0);  // 새로운 입력 코드
            if (!checkNum(myChar)) {
                System.out.println("메뉴를 잘못 선택했습니다.");
                continue;
            }

            int num = myChar - '0';
            System.out.println(num);
            if (num == 0)          // 반복문 종료
            {
                break;
            }
            else
            {
                if (num > 4)
                {
                    System.out.println("메뉴를 잘못 선택했습니다.");
                    continue;
                }


                // 더하기, 빼기 곱하기 나누기 실행
                System.out.println("첫 번째 숫자:");
                int num1 = sc.nextInt();

                System.out.println("두 번째 숫자:");
                int num2 = sc.nextInt();

                if (num ==1)
                    addNum(num1, num2);
                else if (num == 2)
                    minusNum(num1, num2);
                else if (num == 3 )
                    multiplyNum(num1, num2);
                else if (num == 4)
                    divideNum(num1, num2);
            }
            System.out.println("계산기를 종료합니다.");
        }
    }
    public static void showMenu() {
        System.out.println("메뉴를 선택하세요");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.println("0. 끝내기");
    }

    public static void addNum(int num1, int num2) // 1 더하기
    {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    public static void minusNum(int num1, int num2) // 2 빼기
    {
        int result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    public static void multiplyNum(int num1, int num2) // 3 곱하기
    {
        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
    }

    public static void divideNum(int num1, int num2) // 4 나누기
    {
        int result1 = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result1);

        int result2 = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result2);
    }

    public static boolean checkNum(char ch)
    {
        if (ch >= '0' && ch <='9')
        {
            return true;
        }
        else {
            return false;
        }

    }

}
