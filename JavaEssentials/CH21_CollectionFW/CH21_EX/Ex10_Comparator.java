package CH21_EX;

import java.util.Set;
import java.util.Comparator;
import java.util.TreeSet;

abstract class MyStringComparator implements Comparator<String>
{
    public int Compare(String s1, String s2)
    {
        // 길이가 동일한 데이터는 추가되지 않음
        return s1.length() - s2.length();
    }
}
public class Ex10_Comparator {
    public static void main(String[] args) {
        Set<String> tree = new TreeSet<>();     // 1.
//        set<String> tree = new TreeSet<>(new MyStringComparator());
// 2. TreeSet을 만들 때 생성자로 우리가 만든 클래스를 넣어주고 있다. 이 Set에 정렬 조건을 우리가 만든 클래스 안의 compare() 에서드로 하겠다는 의미.

        tree.add("이학승");
        tree.add("류지헌");
        tree.add("임정빈");
        tree.add("김한선");
        tree.add("스위밍란");

        for(String s : tree)
        {
            System.out.println(s.toString() + '\t');
        }
        System.out.println();
    }
}
