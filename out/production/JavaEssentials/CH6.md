# Chapter 6 제어문

---
## 조건문
> 조건식의 결과를 true인 경우와 flase인 경우로 두 가지 흐름을 만들어낼 수 있다.
> + if문을 사용한 조건 분기 ( 제어문 사용 )
> + 조건 연산자를 사용한 조건 분기 ( 연산자 사용 )
> + switch문을 사용한 조건 분기 ( 제어문 사용 )

### if문
> if문은 주어진 조건이 참(True)인 경우에만 특정 코드 블록을 실행하는 제어문인다.

*Ex01_if.java*

### switch문
>조건식의 결과와 일치하는 case문에 작성된 문장을 실행함으로써 많은 선택지를 가진 분기처리 가능  
>어떤 case와도 맞지 않으면 defalut로 넘어간다.  
> 각 case의 마지막에는 break문을 사용해서 선택한 처리만을 실해하도록 한다.
>
```
switch (조건식) {
    case 값1:
        // 변수가 값1과 일치할 때 실행되는 코드
        break;
    case 값2:
        // 변수가 값2와 일치할 때 실행되는 코드
        break;
    // 추가적인 경우들
    default:
        // 어떠한 case에도 일치하지 않을 때 실행되는 코드
}
```
*Ex02_switch.java*  

+ break문을 생략하면 switch문 안에 모든 case문이 실행된다.  
→ *Ex03_SwithchNoneBreak.java*  
+ 자바7 이후로 switch문에 스트링을 사용 가능하다.  
→ *Ex04_SwitchString*

## 반복문
> 어떤 조건이 성립하는 동안 반복 처리를 실행하는 제어문
>> for문을 이용한 반복  
>> while문을 이용한 반복  
>> do~while문을 이용한 반복

### for문을 이용한 반복
→ *Ex05_for.java*

### for문 요소의 생략, 응용
> for문을 구성하는 요소는 상황에 따라 생략 가능  
> → *Ex06_ForExtention.java*

### while문을 이용한 반복
> 반복의 횟수보다는 처리 조건이 정해져 있을 때,  
> for문은 반복의 횟수가 정해져 있을 때 사용하기 좋다.  
> → *Ex07_while.java*

### do~while문을 이용한 반복
> while문과 같이 반복처리를 실행하는 제어문  
> 조건식을 아래쪽에 쓰기 때문에 최소 한 번은 중괄호 안의 문장들이 실행된다.  
``do  
> {  
> 문장;  
> } while(조건문);``  
> → *Ex08_DoWhile.java*

### 레이블을 이용한 중첩된 반복문의 일괄 중지
> 중첩된 반복문의 안쪽 반복문에서 특정 조건을 충족하면 바깥쪽의 모든 반복문까지 중지하고 그다음 코드를 실행.  
> → *Ex09_BreakLabel* ▷ 반복문에 lable을 지정하고 break에 lable 이름 지정
>

---

---
## tossbank 부캠
```java
import java.util.Random;

public class ex12 {
    public static void main(String[] args) {
        //조건문
        // * 자바스크립트 문법과 거의 동일
        //1. 단일 if문
        //패턴
        // if ( 조건절-비교,논리 연산자 ) {
        //    true일때 수행문
        // }
        if (10 < 20) {
            System.out.println("10이 20보다 작음");
        }
        if (10 < 20) //실행문이 한줄일때 중괄호 생략가능
            System.out.println("10이 20보다 작음");
        //2. if else문
        if (10 > 20) {
            System.out.println("10>20");
        } else {
            System.out.println("10<=20");
        }
        if (10 > 20)
            System.out.println("10>20");
        else
            System.out.println("10<=20");
        //3. if else if문
        int score = 90;
        if (score == 90) {
            System.out.println("90");
        } else if (score == 80) {
            System.out.println("80");
        } else {
            System.out.println("그외의 수");
        }
        //4. 중첩 if문
        if (true) { //조건1
            if (false) { //조건2
                //조건1이고(AND) 조건2이다.
            } else if (true) { //조건3
                //조건1이고 조건2는 아니고, 조건 3이다.
            }
        }
        //자바에서 랜덤수 발생
        //1. Math.random()  0.0 ~ 0.99999...
        //2. Random 클래스
        //   rand.netxInt(6) 0 ~ 5 까지의 랜덤 정수 발생

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.println("i,j:" + i + "," + j);
            }
        }


        //연습문제
        //1.
        //철수와 영희가 주사위 놀이를 하고 있다.
        // 주사위 2개를 던져서,
        // 두개 다 짝수가 나오면 철수 승!
        // 두개 다 홀수가 나오면, 영희 승!
        // 그외의 경우는 무승부! 이다.
        // 게임의 결과를 출력하시오.
        Random rand = new Random();
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        System.out.println(dice1);
        System.out.println(dice2);
        if (dice1 % 2 == 0 && dice2 % 2 == 0) {
            System.out.println("철수 승!");
        } else if (dice1 % 2 == 1 && dice2 % 2 == 1) {
            System.out.println("영희 승!");
        } else {
            System.out.println("무승부!");
        }
        System.out.println();
        //2.
        //철수와 영희을 주사위게임을 하고 있다.
        //주사위 2개를 철수가 던지고,
        //주사위 2개를 영희도 던진다.
        //게임룰 : 첫번째 주사위는 십의 자릿수로하고,
        //        두번째 주사위는 일의 자릿수로 해서,
        // 더 높은 점수를 가진 사람이 승리한다.
        //출력값 예시 :
        //        철수 주사위1 수 : 1
        //        철수 주사위2 수 : 3
        //        철수의 점수는 13
        //        영희 주사위1 수 : 3
        //        영희 주사위2 수 : 4
        //        영희의 점수는 34
        //        영희 승!
        int dice3 = rand.nextInt(6) + 1;
        int dice4 = rand.nextInt(6) + 1;
        System.out.println(dice3 + "," + dice4);
        int score1 = dice3 * 10 + dice4;
        int dice5 = rand.nextInt(6) + 1;
        int dice6 = rand.nextInt(6) + 1;
        System.out.println(dice5 + "," + dice6);
        int score2 = dice5 * 10 + dice6;
        if( score1 > score2 ) {
            System.out.println("철수 승");
        }
        else if( score1 < score2 ) {
            System.out.println("영희 승");
        }
        else {
            System.out.println("무승부");
        }

    } //main함수
} //클래스
```
- `Random rand = new Random()` : 	`java.util.Random` 클래스를 사용해 난수 생성
- `rand.nextInt(n)` : 	0부터 n-1까지의 정수 중 랜덤 값 반환 (+1하면 1~n 범위)

```java
public class ex13 {
    public static void main(String[] args) {
        //조건문 switch 문
        // * 자바스크립트와 거의 유사함.
        int a = 10;
        switch (a) {
            case 10:
                System.out.println("10입니다.");
                //break;
            case 20:
                System.out.println("20입니다.");
                break;
            default:
                System.out.println("그외의 경우.");
                break;
        }

        // JDK 8(1.8) 주로 대세!
        // JDK 11, 17, 21, 24
        // 개발환경과 배포환경이 다른다!!
        //   -> 도커(docker) : 외부환경변수에 따르지 않다.
        int month = 3;
        switch (month) {
            case 3, 4, 5: //Java 14버전부터 가능함. 주의!
                break;
            case 6:
            case 7:
            case 8:
                break;
            case 9, 10, 11:
                break;
            case 12, 1, 2:
                break;
        }


    }
}   
```
```java
public class ex14 {
    public static void main(String[] args) {
        //반복문 for while do-while
        // * JS문법과 거의 유사함.

        //패턴
        //for( 초기화; 조건; 증감 ) {
        //   실행문;
        //}
        for( int i=0; i<5; i++){
            System.out.println("i = " + i);
        }

        //무한반복문 만드는 법
        //for(;;){}
        //while (true){}

        //1부터 100사이의 3의 배수만 출력하시오.
        for(int i=1; i<100; i++){
            if( i%3 == 0 ){
                System.out.println("i = " + i);
            }
        }
        
    }
}
```

디버깅 잘하려면? 삽질이 많이 해봐야 된다.  
책. 클린코드
1. 로그를 잘 찍어본다.
2. 간략하게 코드를 만들어 본다. 줄인다.
3. 런타임 디버거를 사용해 본다.
4. 컴퓨터 꼈다 켠다.
5. 간단한 샘플을 만들어 테스트 해본다.


런타임 디버깅 사용법  
*반복문에서 코드의 흐름을 파악하거나, 변수의 값을 확인하는 용도로 사용.
*print문만으로 전체 맥락을 파악하기 어려울때 사용.  
실행 > 디버그 (Shift + F9) 기능 이용  
Break Point(중단점)을 설정한다. CTRL + F8  
스텝오버(F8) : 다음 줄로 이동  
스텝인투(F7) : 함수 안으로 이동  
다시시작(F9) : 계속해서 진행(Resume)  
스텝아웃(SHIFT+F8) : 함수 밖으로 이동    
  
```java
public class ex16 {
    public static void main(String[] args) {
        
        int i = 0;
        while( i<5 ){
            System.out.println( i );
            i++;
        }

        i = 0;
        do {
            System.out.println( i );
            i++;
        } while ( i < 5);
    }
}
```
- while do-while
    - 패턴
      ``` java 
      for( 초기식; 조건식; 증감식 ){
           실행문;
        }
        초기식;
      
        while( 조건식 ){
          실행문;
          증감문; //맨마지막
        }
      ```
* 적어도 한번은 실행후 조건 비교한다.
초기식
    ```java
    do {
      실행문;
      증감문;
    } while( 조건식 );
    ```