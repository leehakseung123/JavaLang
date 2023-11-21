# Chapter 3 변수, 상수, 자료형의 형변환
___

##  변수

 ### 변수의 이해
> 변수 : 값이 변하는 수

+ ``` y = x + 1; ```
     > x, y ( 변수 ) : 대입되는 값에 따라 값이 변한다.  
      1 ( 상수 ) : 이미 정해져 있는 값.

+ `` int num = 1;``  
    > 1. 자료형이 int이므로 메모리에 주소 4개를 확보하여 공간 확보  
    > 2. 십진수 1을 이진수로 변경하여 공간에 저장
    > 3. 공간(주소)을 변수 num기억

+ ```System.out.println(num);```
  > 1. num 변수의 값을 메모리 어디에 적어두었는지 찾아온다.  
  > 2. 찾아낸 메모리의 시작 위치로 찾아간다.
  > 3. num 변수는 int형으로 4비트를 읽는다.
  > 4. 10진수로 바꾸어 숫자로 표기한다.
  >   + char형이면 디코딩하여 문자로 표기

### 변수명을 짓는 방법
  > <규칙>
  > + 숫자로 시작할수 없다.
  > + 특수문자는 변수의 이름 사용 불가
  >     + $, _ 는 제외
  > + 키워드는(ex.public, class, ...) 변수의 이름으로 사용 불가
  > 
  > <권장사항>
  > + 소문자로 시작한다. ↔ 대문자로 시작하는 CLASS와 구별
  > + 데이터를 유추할 수 있는 이름으로 생성

---
## 상수
> 상수 : 변하지 않는 값
>>   1. 리터럴 상수 : 문자 그대로의 값  
>>   2. final 상수 : 프로그래머가 임의로 만든 상수
>>      + 대문자를 이용해서 만든다.

---

## 자료형의 형변환
### 상수값 대입 시 형변환
```
public class Ex02_TypeChange01
{
  public static void main(String[] args)
  {
    int num1 = 1;     //  ①
    byte num2 = 1;    //  
    byte num3 = 127;  //  ②
    byte num4 = 128;  //  ③
    
    short num5 = 1;
    
    num2 = num5;  //  ④
    num2 = (byte)num5;  //  ⑤
  } 
}
```
> ① - int형 리터럴 상수 1을 int형 변수 num2에 대입하여 자연스럽다.  
> ② - 큰 쪽에서 작은쪽으로 자동 형변환  
> ③ - 상수가 변수에 저장할 수 있는 범위의 값보다 큰 값이면 컴퓨터는 출력 불가 → 에러
> ④ - 변수이면 타입만 비교 후 에러처리
> ⑤ - 프로그래머가 직접 책임지고 명시적으로 표시

+ 형반환 표현

    | 주최          | 용어 2   | 용어 2         |
    |:------------|:-------|:-------------|
    | 컴파일러 (자동으로) | 자동 형변환 | 묵시적(암묵적) 형변환 |
    | 프로그래머 (직접)  | 강제 형변환 | 명시적 형변환      |
  + 자동 형반환의 방향  
    ```plaintext
    1바이트     2바이트     4바이트    8바이트     4바이트     8바이트  
     byte   →   short   →   int   →   long   →   float   →  double 
                             ↑
                            char
    ```
    - 예제
      ```
      public class Ex03_TypeChange2
      {
        public static void main(String[] args)
        {
          int num1 = 2147483647;    //  ① OK
          int num2 = 2147483648;    //  ② 에러 발생
          long  num3 = 2147483647;  //  ③ 에러 발생
          long  num4 = 2147483647L; //  ④ OK L을 붙여 형변환 표시
    
          float num5 = 1.0;         //  ⑤ 에러 발생
          float num6 = 1.0F;        //  ⑥ F를 붙여 형변환 표시
    
          double num7 = 30;         //  int ▷ double 자동 형변환
        }
      }
      

### 연산시 형변환

- int, long, float, double을 제외한 자료형은 형변환 필요
- 예제  
```
public class Ex05_Calculation2
  {
  public static void main(String[] args)
  {
    int num31 = 1;
    int num32 = 2;
    int result = num31 + num32;     // OK
    
    long num41 = 1;
    long num42 = 2;
    long result4 = num41 + num42;   // OK
    
    long result5 = num31 + num41;   // OK 자동 형변환 (int ▶ long)
    
    float num61 = 1.0f;             // f 접미사 
    float num62 = 2.0f;             // f 접미사
    float result6 = num61 + num62;  // OK
    
    double num71 = 1.0f;            
    double num72 = 2.0f;
    double result7 = num71 + num72; // OK
    
    double result8 = num61 + num71; // OK 자동 형변환 (float ▶ double)
```