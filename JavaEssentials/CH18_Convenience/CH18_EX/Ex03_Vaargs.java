package CH18_EX;

public class Ex03_Vaargs {
    public static void helloEverybody(String... vargs)      // 1. 가변 인수 표기(... 사용)
    {
        for (String s : vargs)  // 2. 가변 인수 사용, 배열과 같은 방식으로 사용
            System.out.println(s + '\t');
        System.out.println();
    }

    public static void main(String[] args) {
        helloEverybody("홍길동");
        helloEverybody("홍길동", "전우치");
        helloEverybody("홍길동", "전우치", "손오공");
    }
}
