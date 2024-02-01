package CH23_EX;

import java.util.Arrays;
import java.util.List;

public class Ex07_Reduce {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("손흥민", "황희찬", "이강인");

        String name1 = list1.stream()
                .reduce("조규성", (s1, s2) ->  // 1.초깃값으로 주어진 글자 길이는 3이고 이후에 비교되는 글자들의 길이도 다 3이므로 초깃값이 남는다.
                s1.length() >= s2.length() ? s1 : s2);
        System.out.println(name1);

        List<String> list2 = Arrays.asList("손흥민", "실바", "아구에로");

        String name2 = list2.stream()
                .reduce("조규성", (s1, s2) ->  // 2. 초깃값을 포함하여 모든 데이터 중에서 아구에로의 글자 길이가 가장 길다
                        s1.length() >= s2.length() ? s1 : s2);
        System.out.println(name2);
    }
}
