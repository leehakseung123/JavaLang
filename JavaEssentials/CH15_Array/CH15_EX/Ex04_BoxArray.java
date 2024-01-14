package CH15_EX;

class BoxA4 {
    public String name;

    BoxA4(String name) {
        this.name = name;
    }
}
public class Ex04_BoxArray {
    public static void main(String[] args) {
        BoxA4[] ar = new BoxA4[3];          // 1. 배열 선언

        // 2.배열에 객체 저장 (초기화), 배열의 개별 요소에 객체의 참조 값을 대입
        ar[0] = new BoxA4("홍길동");
        ar[1] = new BoxA4("전우치");
        ar[2] = new BoxA4("손오공");

        // 3. 저장된 객체의 참조
        System.out.println(ar[0].name);
        System.out.println(ar[1].name);
        System.out.println(ar[2].name);
    }
}
