package CH20_EX;

class Npc3 {
    public String toString() {
        return "This is a Npc3";
    }
}

class Tank3 {
    public String toString() {
        return "This is a Tank3";
    }
}

class Camp3 {
    private Object unit;

    public void set(Object unit) {
        this.unit = unit;
    }

    public Object get() {
        return this.unit;
    }
}

public class Ex03_MyGmae3 {
    public static void main(String[] args) {

        // 게임 종족 생성
        Camp3 human = new Camp3();
        Camp3 machine = new Camp3();

        // 게임 종족에 유닛을 생성해 담기
        // 우리가 만든 유닛을 넣어야 하는데...
        human.set("난 공룡");      // <-- human.set(new String(" 난 공룡" ));
        machine.set("난 우주인");
        // 1.

        // 게임 종족에서 유닛을 가져오지
        // 꺼낼 떄 당연히 게임 유닛을 기대하는데...
        Npc3 hUnit = (Npc3)human.get();
        Tank3 mUnit = (Tank3)machine.get();
        // 2.

        System.out.println(hUnit);
        System.out.println(mUnit);
    }
}
