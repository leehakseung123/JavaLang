package CH20_EX;

class Npc6 {
    public String toSring() {
        return "This is aNpc6.";
    }
}

class Tank6 {
    public String toString() {
        return "This is a Tank6.";
    }
}

class Camp6<T> {
    private T unit;

    public void set(T unit) {
        this.unit = unit;
    }

    public T get() {
        return unit;
    }
}
public class Ex06_MyGameGeneric2 {
    public static void main(String[] args) {

        //게임 종족 생성
        Camp6<Npc6> human = new Camp6<>();
        Camp6<Tank6> machine = new Camp6<>();

        // 게임 종족에 유닛을 생성해 담기
         human.set(new Npc6());
//          machine.set("난 공룔");
//   주석을 풀면 에러가 발생한다, 타입 인수로 지정한 클래스형 외에 다른 형의 객체는 대입할 수 없다.

        // 게임 종족에서 유닛을 가져오기
        Npc6 hUnit = human.get();
        Tank6 mUnit = machine.get();


        System.out.println(hUnit);
        System.out.println(mUnit);
    }
}
