package CH12_EX;

import sun.util.resources.cldr.ta.CalendarData_ta_LK;

interface Greet // 1. 인터페이스
{
    void greet();
}

interface Talk // 2. 인터페이스
{
    void talk();
}

class Morning implements Greet, Talk //  3.인터페이스 구현, 아침에 관련한 클래스를 만든다.
{
    @Override
    public void greet() {
        System.out.println("안녕하세요!");
    }

    @Override
    public void talk() {
        System.out.println("날씨 좋네요.");
    }
}
public class Ex01Meet {
    public static void main(String[] args) {    // 4. 프로그램 시작
        Morning morning = new Morning();         // 5. 모닝 클래스를 이용하여 객체 생성
        morning.greet();                         // 6. 참조 변수를 이용하여 인터페이스의 추상 메서드를 구현한 greet()메서드 호출
        morning.talk();                          // 7. 참조 변수를 이용하여 인터페이스의 추상 메서드를 구현한 talk()메서드 호출
    }
}
