package Exam;

// 1. 예금액 입력 - 잔액 + 예금액 - 메뉴로 돌아오기
// 2. 출금액 입력 - 잔액 - 예금액 - 메뉴로 돌아오기
// 3. 잔고 확인
import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    while (run) {
      System.out.println("-------------------------------");
      System.out.println("1. 예금 | 2.출금 | 3.잔고 | 4.종료");
      System.out.println("-------------------------------");
      System.out.print("메뉴 선택 >>");

      int menu = sc.nextInt();
      int balance = 0;
      switch (menu) {
        case 1:
          System.out.print("예금액 입력");
          balance += sc.nextInt();
          break;
        case 2:
          System.out.print("출금액 입력");
          balance -= sc.nextInt();
          break;
        case 3:
          System.out.println("잔고" + balance);
          break;
        case 4:
          System.out.println("프로그램 종료");
          run = false;
          break;
      }
    }
  }
}
