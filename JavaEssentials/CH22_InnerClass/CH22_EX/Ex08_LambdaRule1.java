package CH22_EX;

interface Unit8
{
    void move(String s);        // 매개변수 하나, 반환형 void
}

public class Ex08_LambdaRule1 {
    public static void main(String[] args) {
        Unit8 unit;

        unit = (String s) -> {System.out.println(s); };     // 1.줄임 없는 표현
        unit.move("Lambda : 줄임 없는 표현 : 앞 예제 동일");

        unit = (String s) -> System.out.println(s);      // 2. 중괄호 안의 구현부가 한 문자이면 중괄호 생략 가능
        unit.move("Lambda : 중괄호 생략");

        unit = (s) -> System.out.println(s);
        unit.move("Lambda : 매개변수 형 생략");        // 3. 매개변수 형을 생략

        unit = (s) -> System.out.println(s);
        unit.move("Lambda : 매개변수 소괄호 생략");        // 4. 매개변수가 한개라면 소괄호도 생략 가능
    }
}
