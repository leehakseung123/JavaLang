package CH21_EX;

import java.util.ArrayList;
import java.util.List;
public class Ex01_ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();      // 1.

        //객체 저장 : 순서 있음, 중복 허용
        list.add("orage");
        list.add("apple");
        list.add("apple");
        list.add("banana");
        // 2.

        // 객체 참조
        for(int i=0; i<list.size(); i++)        // 3.
        {
            System.out.println(list.get(i) + '\t');     // 4.
        }
        System.out.println();

        // 첫 번쨰 객체 삭제
        list.remove(0);     // 5.

        //삭제 후 객체 참조
        for(int i=0; i< list.size(); i++)
        {
            System.out.println(list.get(i) + '\t');
        }
        System.out.println();
    }
}
