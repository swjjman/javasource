package exam;

import java.util.Scanner;

public class Salary {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("월급입력" + 1000000);
    int Salary = sc.nextInt(1000000);

    // 10년 저축 금액

    int deposit = Salary * 12 * 10;
    System.out.println("10년 저축 금액" + deposit);
  }
}
