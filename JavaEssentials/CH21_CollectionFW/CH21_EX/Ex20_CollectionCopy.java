package CH21_EX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
public class Ex20_CollectionCopy {
    public static void main(String[] args) {
        List<String> src = Arrays.asList("손흥민", "황희찬", "이강인", "조규성");       // 1.

        // 수정 가능한 리스트 생성
        List<String> dst = new ArrayList<>(src);        // 2.
        System.out.println(dst);

        // 정렬하여 그 결과를 출력
        Collections.sort(dst);      // 3.
        System.out.println(dst);

        // 사정상 정렬 이전의 상태로 되돌려야함
        Collections.copy(dst, src);     // 4.
        System.out.println(dst);

        // 5. 수정 가능한지 확인
        dst.remove(0);
        System.out.println(dst);
    }
}
