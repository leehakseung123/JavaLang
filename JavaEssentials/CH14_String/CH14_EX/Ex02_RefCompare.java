package CH14_EX;

public class Ex02_RefCompare {
    public static void main(String[] args) {
        String str5 = new String("자바 프로그래밍");
        String str6 = new String("자바 프로그래밍");
        String str7 = ("자바 프로그래밍");
        String str8 = ("자바 프로그래밍");

        if (str5 == str6)           // 1. 변수 값 비교
            System.out.println("str1과 str2는 동일 객체 참조");
        System.out.println("str1과 str2는 동일 객체 참조");     // 2. 서로 다른 객체의 id값을 가지므로 추력

        if (str7 == str8)           // 3. 참조 id 비교
            System.out.println("str3과 str4는 동일 객체 참조"); // 4. 출력
        System.out.println("str3과 str4는 동일 객체 참조");

    }
}
