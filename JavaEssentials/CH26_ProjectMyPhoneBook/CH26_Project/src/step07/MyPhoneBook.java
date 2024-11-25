package step07;

import step01.PhoneInfo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MyPhoneBook {

    static Scanner sc = new Scanner(System.in);
    static Map<String, PhoneInfo> map = new HashMap<>();
    // 전화번호를 저장한 객체를 저장하는 해시맵 변수를 선언한다.

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
        // 전화번호 정보를 입력받는다.

        PhoneInfo pInfo;
        if (email != null) {
            pInfo = new PhoneInfo(name, phoneNumber, email);
        } else {
            pInfo = new PhoneInfo(name, phoneNumber);
        }
        // 이메일이 입력되었냐 안 되었냐에 따라 서로 다른 생성자를 사용해 PhoneInfo 객체를 생성한다.
        // pInfo.showPhoneInfo();  // 입력된 정보를 확인차 다시 한번 보여준다.
        // 입력된 내용을 확인하던 기존 코드를 주석 처리한다.
        map.put(name, pInfo);   // 해시맵에 생성된 PhoneInfo 객체를 추가한다.
        // System.out.println("맵의 크기 : " + map.size());    // 현재 해시맵에 저장된 정보의 숫자를 출력
        // 입력된 내용을 확인하던 기존 코드를 주석 처리한다.
    }

    public static void selNumber()  // 조회
    {
        System.out.println("조회할 이름 : ");
        String name = sc.nextLine();

//        Set<String> ks = map.keySet();
//        for(String s : ks)
//        {
//            System.out.println(map.get(s).toString());
//        }
//        System.out.println("-----------------------------------");
        // 해시맵에 들어 있는 모든 내용을 출력한다.(확인용)

        PhoneInfo pInfo = map.get(name);    // 입력된 값을 키로 해시맵에서 값을 가져온다.
        pInfo.showPhoneInfo();  // PhoneInfo의 showPhone Info()메서드를 저장된 정보를 출력한다.
    }

    public static void delNumber()      //  삭제
    {
        System.out.print("삭제할 이름 : ");
        String name = sc.nextLine();

        PhoneInfo pInfo = map.remove(name);       // 1.해시맵에서 키의 값을 찾아서 삭제한다.
        if (pInfo != null)  {   // 2. 삭제된 정보가 있다면 pInfo 변수의 값은 해당 객체의 값을 반환받게 된다.
            System.out.println("삭제되었습니다.");
            //pInfo.showPhoneInfo();
        } else {    // 3. 삭제된 정보가 없다면 pInfo 변수의 값은 null입니다.
            System.out.println("해당 값이 없습니다.");
        }

       // Set<String> ks = map.keySet();
        //for(String s : ks)
        //{
        //    map.get(s).showPhoneInfo();
       // }
       // System.out.println("--------------------------");
        // 4.해시맵에 있는 정보를 다 출력해본다. (확인용)

    }

    public static void main(String[] args) {
        readInfo();
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
                    saveInfo(); // 1. 저장, 프로그램이 종료되기 전 savsInfo() 메서드를 호출하여 해시맵에 있는 정보를 저장한다.
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

    public static void saveInfo()
    {
        try (ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("./bin/step06/Object.bin")))
                // 2. 해시맵에 있는 정보를 파일을 만들고 파일에 저장한다.
        {
            Set<String> ks = map.keySet();        // 3. 해시맵에 있는 키값을 가져온다.
            for (String s : ks)
            {
                PhoneInfo pInfo = map.get(s);     //  4.키 값을 이용해서 모든 해시에 저장된 값들을 가져온다.
                oo.writeObject(pInfo);      // 5. 가져온 PhoneInfo 객체를 파일에 저장한다.
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void readInfo()       // 3.
    {
        try (ObjectInputStream oi = new ObjectInputStream( new FileInputStream("./bin/step07/Object.bin")))
        {
            while (true) {
                PhoneInfo pInfo = (PhoneInfo) oi.readObject();
                // 4.
                if (pInfo == null)   // 5.
                {
                    break;
                }
                map.put(pInfo.name, pInfo);  // 6.
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            //e.printStackTrace();
        }
    }
}
