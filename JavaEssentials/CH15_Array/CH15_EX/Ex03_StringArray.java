package CH15_EX;

public class Ex03_StringArray{
    public static void main(String[] args) {
        String[] name = new String[7];      // 1.String형 데이터를 저장할 배열 선언

        String[0] = new String("홍길동");
        String[1] = new String("전우치");
        String[2] = new String("손오공");
        String[3] = new String("강감찬");
        String[4] = new String("이순신");
        String[5] = new String("을지문덕");
        String[6] = new String("양만춘");

        // 문자열 리터럴로 대입하지 않고 new 연산자를 이용하여 새로운 문자열 객체를 만들어 변수에 대입

        int cnum = 0;

        for(int i = 0; i < name.length; i++)    // 3. 배열 name의 요소 개수만큼 반복문으로 반복
        {
            System.out.println(name[i]);        // 4. 배열의 개별 요소에 저장된 값을 출력
            cnum += name.length;                // 5. 배열의 개별 요소에 저장된 값은 문자열
        }

        System.out.println("총 문자의 수 : " + num); // 6. name 배열에 저장되어 있는 모든 문자열의 총 길이를 입력
    }
}
