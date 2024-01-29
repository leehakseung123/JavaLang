package CH22_EX;

interface Unit9
{
    int calc(int a, int b);     // 매개변수 둘, 반환형 int
}
public class Ex09_LambdaRule2 {
    public static void main(String[] args) {
        Unit9 unit;
        unit = (a, b) -> { return  a + b; };
        int num = unit.calc(10, 20);        // 3. 반환형에 맞는 변수로 값을 반환받을 수 있다.
        System.out.println(num);

        unit = (a, b) -> a * b;     //4. 뒤쪽 중괄호와 return 생략 가능
        System.out.println(unit.calc(10, 20));      // 5. 반환형을 변수로 받지 않고 바로 사용 가능
    }
}
