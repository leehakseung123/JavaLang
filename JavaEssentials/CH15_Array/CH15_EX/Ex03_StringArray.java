package CH15_EX;

public class Ex03_StringArray {
    public static void main(String[] args) {
        String[] name = new String[7]; // 1. String형 배열 선언

        name[0] = new String("홍길동");
        name[1] = new String("전우치");
        name[2] = new String("손오공");
        name[3] = new String("강감찬");
        name[4] = new String("이순신");
        name[5] = new String("을지문덕");
        name[6] = new String("양만춘");

        int cnum = 0;

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
            cnum += name[i].length(); // 각 문자열의 문자 수 합산
        }

        System.out.println("총 문자의 수 : " + cnum);
    }
}
