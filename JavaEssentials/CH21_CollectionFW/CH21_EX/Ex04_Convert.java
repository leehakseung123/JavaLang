package CH21_EX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Ex04_Convert {
    public static void main(String[] args) {

        // 매개변수로 전달된 객체들은 저장한 컬렉션 객체의 생성 및 반환
        // 이렇게 생성된 리스트 객체는 요소를 추가하거나 삭제할 수 없는 객체임
        List<String> list = Arrays.asList("손흥민", "조규성", "이강인", "황희찬");  // 1. 유틸 메서드를 사용하여 초기화 데이터 삽입
//          list.add("멀린");     실행하면 에러남
        list = new ArrayList<>(list);       // 2. 수정 가능한 객체로 변환, 생성자를 이용하여 다시 만들면 크기의 변경 가능해짐
        list.add("해리포터");       // 에러 안남

        // ArrayList<E> 객체의 순환
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
        {
            System.out.println(itr.next() + '\t');
        }
        System.out.println();

        //  ArraysList<E> 객체의 순환
        for(String s : list)
        {
            System.out.println(s + '\t');
        }
        System.out.println();

        // 3. ArrayList<E>를 LinkedList<E>로 변환, 생성자를 이용하여 다시 만들어 데이터 성격을 바꿀 수 있음
        list = new LinkedList<>((list));

        // LinkedList<E> 객체의 순환
        for(String s : list)
        {
            System.out.println(s + '\t');
        }
        System.out.println();
    }
}
