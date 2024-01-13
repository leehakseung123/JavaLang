package CH14_1_EX;

public class Ex06_Substring {
    public static void main(String[] args) {
        String str1 = "AppleBananaOrange";
        int num1 = str1.indexOf("Banana");      // banana 시작 위치 반환
        int num2 = str1.indexOf("Orange");      // orange 시작 위치 반환

        String str2 = str1.substring(num1, num2);   // 구간 반환, substing(5, 11) 5부터 10까지 문자열 바환
        System.out.println(str2);

        String str3 = str1.substring(num2);     // 특정 위치 이후 반환, 11부터 끝까지 반환
        System.out.println(str3);
    }
}
