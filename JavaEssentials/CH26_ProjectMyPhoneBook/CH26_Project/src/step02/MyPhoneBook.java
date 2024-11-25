// PhoneInfo클래스를 사용할 클래스

package step02;

import java.util.Scanner;

public class MyPhoneBook {

    static Scanner sc = new Scanner(System.in);

    public static void showMenu()
    {
        System.out.println("[메뉴 선택]");
        System.out.println("1. 전화번호 입력");
        System.out.println("2. 전화번호 조회");
        System.out.println("3. 전화번호 삭제");
        System.out.println("4. 종료");
        System.out.println("선택 : ");
        // 1. 메인 메뉴를 구성
    }

    public  static void addNumber() // 2. 추가
    {

    }

    public static void selNumber()  // 3. 조회
    {

    }

    public static void delNumber()      // 4. 삭제
    {

    }

    public static void main(String[] args) {
        int choice;     // 5. 사용자가 입력한 값을 보관하는 변수를 선언
        while(true)     // 6. 프로그램이 계속 실행되도록 while문으로 구송
        {
            showMenu(); // 7.메뉴를 출력
            choice = sc.nextInt();      // 8.사용자의 입력을 통해 메뉴를 선택할 수 있도록 한다.
            sc.nextLine();      // 9. 숫자를 입력하고 엔터키를 입력하기 때문에 엔터 처리를 위해 한 번 더 입력 처리를 해준다.
            switch (choice)     // 10. 사용자가 선택한 메뉴에 맞는 메서드를 호출해준다.
            {
                case 1:
                    addNumber();
                    break;
                case 2:
                    selNumber();
                    break;
                case 3:
                    delNumber();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다. ");
                    return;
                    // 11. 종료를 선택하면 return을 통해 main() 메서드를 빠져나가게 해서 프로그램들 종료시킨다.
                default:
                    System.out.println("잘 못 입력하셨습니다.");
                    break;
                    // 12. 메뉴에 없는 번호가 입력되었다면 메시지를 보여주고 다시 메뉴를 선택할 수 있도록 한다.
            }
        }
    }
}
