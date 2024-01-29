package CH22_EX;

interface  Unit7
{
    void move(String s);
}
public class Ex07_Lambda3 {
    public static void main(String[] args) {
        Unit7 unit = (String s) ->
        {
            System.out.println(s);
        };  // 1. 람다식을 구현, 람다식을 인터페이스형 변수에 대입, 인터페이스의 메서드는 무조건 구현을 해줘야 하는 것이기에 람다식
        unit.move("Lambda : Unit 7");   // 2. 인터페이스 안의 기능을 수행하면 당연히 대입받은 메서드가 실행
    }
}
