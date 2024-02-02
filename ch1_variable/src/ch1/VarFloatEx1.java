package ch1;

/* 변수 : 하나의 값을 저장하기 위한 공간
 *        타입지정 - 정수형,문자형,불린형,실수형
 *        값은 변할 수 있다
 *        1 byte == 8bit == 256개 (0~255 표현) => -128 ~ 127
 *
 * 상수 : 값을 한 번만 저장하는 공간
 *        final int WIDTH = 20;
 */

public class VarFloatEx1 {

  public static void main(String[] args) {
    //4. 실수형 - float(4byte), double(8byte)
    float score1 = 90.17F; // f, F
    double score2 = 98.5d; // d, D
    System.out.println("score1 = " + score1);
    System.out.println("score2 = " + score2);

    float var3 = 0.1234567890123456789f;
    double var4 = 0.1234567890123456789d;
    System.out.println("var3 = " + var3);
    System.out.println("var4 = " + var4);
  }
}
