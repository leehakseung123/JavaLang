package CH23_EX;

import java.util.Arrays;
import java.util.List;
public class Ex04_Sorted {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("손흥민", "황희찬", "이강인");

        // 사전순 정렬
        list.stream()
                .sorted()       // 스트림을 사전순으로 정렬
                .forEach(n -> System.out.println(n + "\t"));

        System.out.println();

        // 글자 길이순 정렬
        list.stream()
                .sorted((s1, s2) -> s1.length() - s2.length())      // 2. 람다식을 이용하여 스트림을 길이순으로 정렬
                .forEach(n -> System.out.println(n + "\t"));

        System.out.println();
    }
}

