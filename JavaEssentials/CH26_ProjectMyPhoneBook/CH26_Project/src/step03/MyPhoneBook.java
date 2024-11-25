package step03;

import step01.PhoneInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyPhoneBook {

    static Scanner sc = new Scanner(System.in);
    static Map<String, PhoneInfo> map = new HashMap<>();
    // 1. 전화번호를 저장한 객체를 저장하는 해시맵 변수를 선언한다.

    public static void showMenu()
    {
        System.out.println("[메뉴 선택]");
        System.out.println("1. 전화번호 입력");
        System.out.println("2. 전화번호 조회");
        System.out.println("3. 전화번호 삭제");
        System.out.println("4. 종료");
        System.out.println("선택 : ");
        // 메인 메뉴를 구성
    }

    public  static void addNumber() // 추가
    {
        System.out.print(" 이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = sc.nextLine();
        System.out.print("이메일 : ");
        String email = sc.nextLine();
        // 2. 전화번호 정보를 입력받는다.

        PhoneInfo pInfo;
        if (email != null) {
            pInfo = new PhoneInfo(name, phoneNumber, email);
        } else {
            pInfo = new PhoneInfo(name, phoneNumber);
        }
        // 3. 이메일이 입력되었냐 안 되었냐에 따라 서로 다른 생성자를 사용해 PhoneInfo 객체를 생성한다.
        pInfo.showPhoneInfo();  // 4. 입력된 정보를 확인차 다시 한번 보여준다.
        map.put(name, pInfo);   // 5. 해시맵에 생성된 PhoneInfo 객체를 추가한다.
        System.out.println("맵의 크기 : " + map.size());    // 6. 현재 해시맵에 저장된 정보의 숫자를 출력
    }

    public static void selNumber()  // 조회
    {

    }

    public static void delNumber()      //  삭제
    {

    }

    public static void main(String[] args) {
        int choice;     //  사용자가 입력한 값을 보관하는 변수를 선언
        while(true)     //  프로그램이 계속 실행되도록 while문으로 구송
        {
            showMenu(); // 메뉴를 출력
            choice = sc.nextInt();      // 사용자의 입력을 통해 메뉴를 선택할 수 있도록 한다.
            sc.nextLine();      //  숫자를 입력하고 엔터키를 입력하기 때문에 엔터 처리를 위해 한 번 더 입력 처리를 해준다.
            switch (choice)     //  사용자가 선택한 메뉴에 맞는 메서드를 호출해준다.
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
                    // 종료를 선택하면 return을 통해 main() 메서드를 빠져나가게 해서 프로그램들 종료시킨다.
                default:
                    System.out.println("잘 못 입력하셨습니다.");
                    break;
                    // 메뉴에 없는 번호가 입력되었다면 메시지를 보여주고 다시 메뉴를 선택할 수 있도록 한다.
            }
        }
    }
}
