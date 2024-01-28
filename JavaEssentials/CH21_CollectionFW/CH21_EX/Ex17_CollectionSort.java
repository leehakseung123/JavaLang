package CH21_EX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex17_CollectionSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("손흥민", "황희찬", "이강인", "조규성");      // 1.초기값을 가지고 있지만 크기의 변경이 불가
        list = new ArrayList<>(list);       // 2.크기의 변경이 가능하게 리스를 새로 만든다.

        // 정렬 이전 출력
        System.out.println(list);

        // 3.Collections.sort()메서드를 이용하여 리스트를 정렬
        Collections.sort(list);

        // 정렬 이후 출력
        System.out.println(list);
    }
}
