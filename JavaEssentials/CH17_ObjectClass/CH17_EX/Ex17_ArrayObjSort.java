package CH17_EX;

import java.util.Arrays;

class Person implements Comparable { // 1 Comparable 인터페이스
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Object o) { // 2 메서드 구현
        Person p = (Person)o;

        int nNum = this.name.compareTo(p.name);
        return nNum;            // 3. 이름비교

        // if(this.age > p.age) // 4 나이 비교
        //      return 1; // 5
        // else if(this.age < p.age)
        //      return -1; // 6
        // else
        //      return 0; // 7
    }

    public String toString() { // 8
        return name + ": " + age;
    }
}

public class Ex17_ArrayObjSort {
    public static void main(String[] args) {
        Person[] arr = new Person[3];

        arr[0] = new Person("홍길동", 29);
        arr[1] = new Person("전우치", 15);
        arr[2] = new Person("손오공", 37);

        Arrays.sort(arr); // 9

        for (Person p : arr) // 10
            System.out.println(p);
    }
}
