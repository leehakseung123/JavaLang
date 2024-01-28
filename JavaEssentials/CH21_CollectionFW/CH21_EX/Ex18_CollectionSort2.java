package CH21_EX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringDesc implements Comparator<String>   // 1.Comparator<T> 인터페이스를 구현한 클래스를 만든다.
{
    public int compare(String s1, String s2)
    {
        return s2.compareTo(s1);        // 2. 이렇게 비교하면 내림차순 비교가 된다. 매개변수의 순서를 바꾸면 오름차순이 된다.
    }
}
public class Ex18_CollectionSort2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("손흥민");
        list.add("황희찬");
        list.add("이강인");

        // 정렬 : 오름차순
        Collections.sort(list);     // 3. Collections.sort() 메서드를 이용해 리스트를 정렬, String은 기본적으로 오름차순 정렬
        System.out.println(list);

        StringDesc cmp = new StringDesc();      // 4. 우리가 만든 비교 조건이 있는 클래스를 만든다.

        // 정렬 : 내림차순
        Collections.sort(list, cmp);            // 5. Collection.sort() 메서드에 우리가 만든 클래스를 매개변수로 넘겨 정렬의 비교 조건을 바꿔준다.
        System.out.println(list);
    }
}
