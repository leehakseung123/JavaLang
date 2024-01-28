package CH21_EX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex11_ConverExt {
    public static void main(String[] args) {
        List<String> fixedSizeList = Arrays.asList("아게로", "스털링", "다실바", "김덕배");
        // 1. Arrays.asList() 메서드로 만들어진 List는 초깃값을 가질 수는 있지만 크기의 변경이 안된다.
        ArrayList<String> list = new ArrayList<>(fixedSizeList);       // 2. 크기의 변경이 간으하게 다시 만들어준다.

        for(String s : list)
        {
            System.out.println(s.toString() + '\t');
        }
        System.out.println();

        // 중복 제거
        HashSet<String> set = new HashSet<>(list);  //3.Set의 특성을 이용해서 중복을 제거한다.
        //4. 다시 list로 변환
        list = new ArrayList<>(set);

        for(String s : list)    // 5. 리스트의 내용을 출력해보면 중복이 제거된 것을 확인할 수 있다.
        {
            System.out.println(s.toString() + '\t');
        }
        System.out.println();
    }
}
