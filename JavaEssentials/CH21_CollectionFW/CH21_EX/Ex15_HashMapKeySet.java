package CH21_EX;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex15_HashMapKeySet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Key-Value 기반 데이터 저장
        map.put("손흥민", 20);
        map.put("황희찬", 25);
        map.put("이강인", 27);

        // 1. key만 담고 있는 컬렉션 객체 생성, Map에서 Key만 꺼내와서 Set에 저장할 수 있다.
        Set<String> ks = map.keySet();

        // 전체 Key 출력(향상된 기능의 for문 기반)
        for(String s : ks)      // 2. key값들을 이용해서 반복문을 사용할 수 있다.
        {
            System.out.print(s + '\t');
        }
        System.out.println();

        // 전체 Value 출력 ( 향상된 기능의 for문 기반 )
        for(String s : ks)
        {
            System.out.print(map.get(s).toString() + '\t');
        }
        System.out.println();

        // 전체 Value 출력 ( 반복자 기반 )
        for(Iterator<String> itr = ks.iterator(); itr.hasNext(); )
        {
            System.out.print(map.get(itr.next()).toString() + '\t');
        }
        System.out.println();

    }
}
