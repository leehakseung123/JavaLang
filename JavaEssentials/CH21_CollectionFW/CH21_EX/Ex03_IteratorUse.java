package CH21_EX;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Ex03_IteratorUse {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        // 객체 저장 : 순서 있음, 중복 허용
        list.add("Orange");
        list.add("apple");
        list.add("apple");
        list.add("banana");

        // 향상된 기능의 for 문으로 객체 참조
        for(String s : list)    // 1. 향상된 for문
        {
            System.out.println(s + '\t');
        }
        System.out.println();

        // 2. 반복자를 이용한 순차적 참조, 제네릭으로 자료형이 지정되어 있음
        Iterator<String> itr = list.iterator();

        // 반복자를 이용한 순차적 참조
        String str;
        while(itr.hasNext())        // 3. 반복할 수 있는지 hasNext() 메서드로 확인하고 반복이 가능하다면
        {
            str = itr.next();       // 4. next() 메서드로 항목을 가져오게 된다.
            System.out.println(str + '\t');

            if(str.equals("orange"))
            {
                itr.remove();       // 5. 반복자로 구해온 요소를 remove() 메서드로 제거할 수도 있다, 한번 사용한 반복자는 재사용 불가
            }
        }
        System.out.println();

        // 6.반복자 다시 획득
        itr = list.iterator();

        // 삭제 후 결과 확인
        while(itr.hasNext())
        {
            System.out.println(itr.next() + '\t');
        }
        System.out.println();
    }
}
