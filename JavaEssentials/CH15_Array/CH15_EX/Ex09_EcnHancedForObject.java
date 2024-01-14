package CH15_EX;

class House {
    private int houseNum;
    private String name;

    House(int houseNum, String name) {
        this.houseNum = houseNum;
        this.name = name;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public String getName() {
        return name;
    }
}
public class Ex09_EcnHancedForObject {
    public static void main(String[] args) {
        House[] arr = new House[5];     // 배열은 선언

        arr[0] = new House(101, "홍길동");
        arr[1] = new House(102, "전우치");
        arr[2] = new House(103, "손오공");
        arr[3] = new House(104, "해리포터");
        arr[4] = new House(105, "멀린");
        // 객체를 생성하고 배열의 개별 요소에 참조 값을 대입

        for (House e:arr)       // 3.향상된 기능의 for문
        {
            if(e.getHouseNum() == 92)       // 4. 게터 메서드로 객체의 멤버 변수의 값을 꺼내서 값을 비교하고 출력
                System.out.println(e.getName());
        }
    }
}
