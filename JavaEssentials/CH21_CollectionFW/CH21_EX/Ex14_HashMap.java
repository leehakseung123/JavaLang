package CH21_EX;

import java.util.HashMap;
public class Ex14_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();      // 1. HashMap 객체 선언

        // 2. Key - Value 기반 데이터 저장, put()메서드로 key, value 값을 추가
        map.put("손흥민", "010-1234-1443");
        map.put("황희찬", "010-4321-1446");
        map.put("이강인", "010-9876-1443");

        // 3. 데이터 탐색, get() 메서드로 key값을 매개변수로 주어 value값을 찾아온다.
        System.out.println("손흥민 : " + map.get("손흥민") );
        System.out.println("황희찬 : " + map.get("황희찬") );
        System.out.println("이강인 : " + map.get("이강인") );
        System.out.println();

        // 4.  데이터 삭제, remove() 메스드로 key값을 매개변수로 주어 데이터를 삭제한다.
        map.remove("황희찬");

        // 5. 데이터 삭제 확인, Map에 없는 값을 키값으로 찾으면 null이 반환된다.
        System.out.println("황희찬 : " + map.get("황희찬") );
    }
}
