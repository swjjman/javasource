package Exam;

public class WhileEx1 {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("I can do it.");
    }
    int i = 0;
    while (i < 5) {
      System.out.println("I can do it.");
      i++;
    }

    int sum = 0;
    // for (int i = 1; i <= 10; i++) {
    //   System.out.println(i);
    //   sum += i; //sum = sum + i;
    // }
    System.out.println("1 ~ 10 까지 합 " + sum);
    i = 0;
    while (i <= 10) {
      System.out.println("1 ~ 10 까지 합 " + sum);

      sum += i;
    }
  }
}
