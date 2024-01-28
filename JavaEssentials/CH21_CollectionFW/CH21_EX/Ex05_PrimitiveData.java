package CH21_EX;

import java.util.Iterator;
import java.util.LinkedList;
public class Ex05_PrimitiveData {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // 1. 저장 과정에서 오토 박싱, 데이터를 추가할 때 오토 박싱이 일어난다. int --> Integer
        list.add(10);
        list.add(20);
        list.add(30);

        for(Iterator<Integer> itr = list.iterator(); itr.hasNext(); )
        {
            int n = itr.next();     // 2. 오토 언박싱, 데이터를 꺼내올 때 오토 언박싱이 일어난다. Integer --> int
            System.out.println(n);
        }
    }
}
