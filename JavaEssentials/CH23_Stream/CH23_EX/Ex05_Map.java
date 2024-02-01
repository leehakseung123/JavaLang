package CH23_EX;

import java.util.Arrays;
import java.util.List;
public class Ex05_Map {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        list.stream()       // 1.컬렉션 프레임워크에는 스트림을 만들 수 있는 메서드가 이미 구현되어 있다.
                .map( s-> s.toUpperCase())      // 2. 데이터를 하나씩 받아 대문자로 데이터를 변환시킨다.
                .forEach(n -> System.out.println(n + "\t"));        // 3. 개별 요소를 하나씩 건네받아 출력한다.

        System.out.println();
    }
}
