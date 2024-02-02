package operator;

import java.util.Scanner;

public class ConditionEx2 {

  public static void main(String[] args) {
    // 조건 연산자 : 조건식? 식1:식2;
    // x가 y보다 크면 x 값을 변수에 담고, 그게 아니면 y 값을 담기

    //  숫자 입력 받은 후 그 숫자가 양수인지 음수인지 판별)

    Scanner sc = new Scanner(System.in);
    System.out.print("숫자 입력");
    int num = sc.nextInt();
    System.out.println(num > 0 ? "양수" : "음수");

    // 짝수 홀수 판별

    System.out.println(num % 2 == 0 ? "짝수" : "홀수");

    char ch1 = 'a';
    // ch1이 영문자이거나 1~9 사이의 숫자인지 판별

    boolean result =
      ch1 > 'A' && ch1 < 'Z' || ch1 >= 'a' || ch1 < 'b' || ch1 >= 1 && ch1 <= 9;
    System.out.println(result);
  }
}
//   System.out.println((i % 2 == 00 || i % 3 == 0) && i % 6 != 0);
