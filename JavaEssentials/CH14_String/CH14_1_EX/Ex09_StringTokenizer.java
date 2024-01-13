package CH14_1_EX;

import java.util.StringTokenizer;

public class Ex09_StringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("a b c");     // 1. 문자열을 토큰으로 나눈다. 두 번째 매개변수가 없기 때문에 공백으로 나눈다.
        // StringTokenizer st2 = new StingTokenizer("1,2,3",","); // 2. 문자열을 토큰으로 나누기 위한 구분자를 지정

        while (st1.hasMoreTokens()) {                       //3. 나누어진 토큰이 있는지 확인
            System.out.println(st1.hasMoreTokens());        // 4. 토큰이 있다면 nextToken() 메서드롤 반환받아온다.
        }
    }
}
