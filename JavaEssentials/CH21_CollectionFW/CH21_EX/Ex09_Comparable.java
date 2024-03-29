package CH21_EX;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

class Student2 implements Comparable<Student2>      // 1. comparable<T> 인터페이스가 반드시 구현되어 있어야 한다.
{
    private String name;
    private int age;

    public Student2(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return name + ":" + age;
    }

    public int compareTo(Student2 p)        // 2. 메서드에서 비교
    {
        return this.age - p.age;            // 3. 나이 오름차순 정렬
//        return p.age - this.age;            // 4. 나이 내림차순 정렬
//        return this.name.compareTo(p.name); // 5. 이름 오름차순 정렬
//        return p.name.compareTo(this.name); // 6. 이름 내림차순 정렬
    }
}
public class Ex09_Comparable {
    public static void main(String[] args) {
        Set<Student2> tree = new TreeSet<>();
        tree.add(new Student2("르브론", 30));
        tree.add(new Student2("웸비", 40));
        tree.add(new Student2("치치", 20));

        for(Student2 s : tree)
        {
            System.out.println(s);
        }
    }

}
