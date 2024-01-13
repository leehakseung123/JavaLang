package CH14_1_EX;

public class Ex07_length {
    public static void main(String[] args) {
        String str = "apple";
        for (int i=0; i<str.length(); i++)      // 1. 문자열 길이 확인
        {
            char ch = str.charAt(i);            // 2. 문자 읽기
            if( ch == '1')
                break;
            System.out.println(ch);
        }
    }
}
