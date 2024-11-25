// PhoneInfo클래스를 사용할 클래스

package step01;

public class MyPhoneBook {
    public static void main(String[] args) {
        PhoneInfo pInfo1 = new PhoneInfo("손흥민", "010-1234-5678", "tot@hot.com");
        // 1.이름, 전화번호, 이메일 세 정보를 다 가진 생성자를 통해 데이터 객체를 만든다.
        PhoneInfo pInfo2 = new PhoneInfo("황희찬", "010-4321-8765", "wol@won.com");
        // 2. 이름, 전화번호만 가진 생성자를 통해 데이터 객체를 만든다.

        pInfo1.showPhoneInfo();
        pInfo2.showPhoneInfo();
        // 3.해당 객체에 저장된 정보를 출력한다.
    }
}
