package CH21_EX;

import java.util.Iterator;
import java.util.TreeSet;
public class Ex08_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("아자르");
        tree.add("드록바");
        tree.add("램파드");
        tree.add("캉테");
        tree.add("루이스");

        System.out.println("객체 수 : " + tree.size());

        // Iterator 반복자에 의한 반복
        for(Iterator<String> itr = tree.iterator(); itr.hasNext();)
        {
            System.out.println(itr.next().toString() + '\t');
        }
        System.out.println();
    }
}
