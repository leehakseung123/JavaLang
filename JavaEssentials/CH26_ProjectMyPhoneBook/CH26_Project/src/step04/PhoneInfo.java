package step04;

public class PhoneInfo {
    String name;
    String phoneNumber;
    String email;

    public PhoneInfo(String name, String phoneNumber)       // 1. 생성자, 생성자를 통해 필드값을 초기화할 수 있도록 한다.
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public PhoneInfo(String name, String phoneNumber, String email)
    // 2. 저장, 주소록의 값으로 이름, 전화번호만 입력될 수도,
    // 이메일 까지도 입력될 수도 있으므로 생성자의 오버로딩 기능을 사용하여 다양한 입력 방법을 만들어준다.
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public void showPhoneInfo() // 3. 읽기, 입력된 값을 보여줄 수 있는 메서드를 만들어준다.
    {
        System.out.println("Name : " + name);
        System.out.println("PhoneNumber : " + phoneNumber);
        if (email != null)
        {
            System.out.println("Email : " + email);
        }
        System.out.println("------------------------------------");
    }
}
