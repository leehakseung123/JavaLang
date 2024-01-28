package CH21_EX;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Ex06_Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();      // 1. 구체적인 형태를 HashSet으로 지정하여 객체를 만들고 사용으 Set으로 한다.
        set.add("Orange");      // 2. add() 메서드를 이용하여 데이터를 추가
        set.add("apple");
        set.add("banana");
        set.add("apple");       // 3. 중복된 데이터이기에 저장되지 않는다.

        System.out.println("객체의 수 : " + set.size());    // 4. size() 메서드를 이용하여 저장된 데이터의 수를 알아온다.

        // 반복자를 이용한 전체 출력
        for(Iterator<String> itr = set.iterator(); itr.hasNext(); )     // 5. Iterator를 이용하여 반복자를 구해온다.
        {   // hasNext() 메서드로 다음 반복이 가능한지 알아온다.
            System.out.println(itr.next() + '\t');      // 6.next() 메서드로 Set 컬렉션 프레임워크 안의 요소를 가져온다.
        }
        System.out.println();

        //향상된 기능의for문을 이용한 전체 출력
        for(String s : set)     // 7. Set 컬렉션 프레임워크는 Iterable을 구현했기 때문에 향사된 기능의for문을 사용할 수 있다.
        {
            System.out.println(s + '\t');
        }
        System.out.println();
    }
}
