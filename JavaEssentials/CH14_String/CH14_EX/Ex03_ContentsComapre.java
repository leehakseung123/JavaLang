package CH14_EX;

public class Ex03_ContentsComapre {
    public static void main(String[] args) {
        String str11 = new String("Apple");     // 1.
        String str22 = new String("apple");     // 2.
        String str33 = new String("Banana");     // 3.
        // 1, 2, 3에서 생성된 객체는 문자열 리터럴이 다르기 떄문이 아니고 new에 의해서 만들어졌기 때문에 서로 다른 객체이다.
        int cmp;

        //인스턴스 내용 비교
        if(str11.equals(str33))         // 4. 객체 안에 들어 있는 문자열의 내용을 비교하기 때문에 5.가 출력
            System.out.println("두 문자열은 같습니다.");
        System.out.println("두 문자열은 다릅니다.");     // 5.

        cmp = str11.compareTo(str22);          // 6. 대소문자 구분해 사전순 비교

        if(cmp == 0)
            System.out.println("두 문자열은 일치합니다.");
        else if (cmp < 0)
            System.out.println("사전의 앞에 위치하는 문자 : " + str11);        // 7. 대소문자를 구별하기 때문에 실행
        else
            System.out.println("사전의 앞에 위치하는 문자 : " + str22);

        if(str11.compareToIgnoreCase(str22) == 0)       //8. 대소문자 구분 없이 사전순 비교
            System.out.println("두 문자열은 같습니다.");     //9. 실행
        else
            System.out.println("두 문자열은 같습니다.");
    }
}
