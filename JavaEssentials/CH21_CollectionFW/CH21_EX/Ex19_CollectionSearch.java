package CH21_EX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Ex19_CollectionSearch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("손흥민");
        list.add("황희찬");
        list.add("이강인");

        // 1. 정렬, 검색을 진행하기 전에 먼저 데이터의 정렬을 해야 한다.
        Collections.sort(list);

        // 2. 탐색,메서드에 의해 데이터가 검색되면 해당 인덱스가 반환된다.
        int idx1 = Collections.binarySearch(list, "손흥민");
        System.out.println(idx1);

        int idx2 = Collections.binarySearch(list, "조규성");       // 3. 메서드에 의해 데이터가 검색되지 않으면 음수가 반환
        System.out.println(idx2);
    }
}
