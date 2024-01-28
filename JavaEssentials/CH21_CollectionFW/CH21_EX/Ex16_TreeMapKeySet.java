package CH21_EX;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Ex16_TreeMapKeySet {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();     // 1. TreeMap 사용 부분

        // Key-Value 기반 데이터 저장
        map.put("손흥민", 20);
        map.put("황희찬", 25);
        map.put("이강인", 27);

        // 2. Key만 담고 있는 컬렉션 인스턴스 생성, keySet() 메서드로 키만 가져올 수 있다, key들이 TreeMap 성격상 정렬되어 있다.
        Set<String> ks = map.keySet();

        // 전체 Key 출력(향상된 기능의 for문 기반)
        for(String s : ks)
        {
            System.out.println(map.get(s).toString() + '\t');
        }
        System.out.println();

        // 전체 Value 출력 ( 반복자 기반 )
        for(Iterator<String> itr = ks.iterator(); itr.hasNext(); )
        {
            System.out.println(map.get(itr.next()).toString() + '\t');
        }
        System.out.println();
    }
}
