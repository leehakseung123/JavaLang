package CH22_EX;

interface Unit10
{
    String move();      // 매개변수 없음, 반환형 String
}
public class Ex10_LambdaRule3 {
    public static void main(String[] args) {
        Unit10 unit = () -> {       // 1. 매개변수가 없을 때는 형식을 유지하기 위해 빈 소괄호를 사용, 생략 불가
            return "인간형 유닛 이동";
        };

        System.out.println(unit.move());
    }
}
