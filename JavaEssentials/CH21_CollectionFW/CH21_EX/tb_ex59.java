package CH21_EX;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 성적 관리 프로그램
class Student1 {
    String name;
    int kor;
    int eng;
    int math;

    public Student1(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

public class tb_ex59 {
    public static List<Student1> scoreList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("-----성적 관리 프로그램-----");
            System.out.print("1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : ");
            int menu = scanner.nextInt();

            if (menu == 1) { // 입력
                System.out.print("이름 입력: ");
                String name = scanner.next();
                System.out.print("국어점수 : ");
                int kor = scanner.nextInt();
                System.out.print("영어점수 : ");
                int eng = scanner.nextInt();
                System.out.print("수학점수 : ");
                int math = scanner.nextInt();

                scoreList.add(new Student1(name, kor, eng, math));
            } else if (menu == 2) { // 전체 출력
                for (Student1 student : scoreList) {
                    printInfo(student);
                    System.out.println();
                }
            } else if (menu == 3) { // 검색
                System.out.print("검색할 사람의 이름 : ");
                String searchWord = scanner.next();
                for (Student1 student : scoreList) {
                    if (searchWord.equals(student.name)) {
                        printInfo(student);
                        System.out.println();
                    }
                }
            } else if (menu == 4) { // 수정
                System.out.print("수정할 사람의 이름 : ");
                String name = scanner.next();
                System.out.print("수정할 내용은? 1.국어 2.영어 3.수학 : ");
                int no = scanner.nextInt();
                System.out.print("수정할 점수: ");
                int score = scanner.nextInt();

                int index = 0;
                for (Student1 student : scoreList) {
                    if (name.equals(student.name)) {
                        if (no == 1) student.kor = score;
                        else if (no == 2) student.eng = score;
                        else if (no == 3) student.math = score;
                        scoreList.set(index, student); // 수정된 객체 반영
                        break;
                    }
                    index++;
                }

            } else if (menu == 5) { // 삭제
                System.out.print("삭제할 사람의 이름 : ");
                String name = scanner.next();
                int index = 0;
                for (Student1 student : scoreList) {
                    if (name.equals(student.name)) {
                        scoreList.remove(index);
                        break;
                    }
                    index++;
                }

            } else if (menu == 6) { // 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

        scanner.close();
    }

    static void printInfo(Student1 student) {
        System.out.print(" 이름: " + student.name);
        System.out.print(" 국어: " + student.kor);
        System.out.print(" 영어: " + student.eng);
        System.out.print(" 수학: " + student.math);
        int sum = student.kor + student.eng + student.math;
        double avg = sum / 3.0;
        System.out.print(" 총점: " + sum);
        System.out.print(" 평균: " + avg);
    }
}
