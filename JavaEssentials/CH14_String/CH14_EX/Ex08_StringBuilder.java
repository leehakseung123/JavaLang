package CH14_EX;

public class Ex08_StringBuilder {
    public static void main(String[] args) {
        StringBuilder buf = new StringBuilder("동해물과");      // 1. 객체를 만들어 변수에 참조 값을 대입

        buf.append("백두산이");         // 2. 추가
        System.out.println(buf.toString());     //3. 형변환 후 출력

        buf.append(12345);          // 4. 추가, 매개변수의 타입이 여러 가지인 메서드가 오버로딩되어 있다.
        System.out.println(buf.toString());

        buf.delete(0, 4);           // 5. 구간 삭제
        System.out.println(buf.toString());

        buf.replace(4, 8, "ABC");   // 6. 값 변경
        System.out.println(buf.toString());

        buf.reverse();              // 7. 순서 반전
        System.out.println(buf.toString());
    }
}
