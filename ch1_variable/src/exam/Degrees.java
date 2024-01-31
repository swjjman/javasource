package exam;

import java.util.Scanner;

public class Degrees {

  public static void main(String[] args) {
    //  화씨온도 = > 섭씨온도
    // (화씨 − 화씨) × 5/9 = 섭씨°C

    Scanner sc = new Scanner(System.in);

    System.out.print("화씨온도입력");
    int fahr = sc.nextInt();

    double cels = (fahr - 32) * 5 / 9.0;
    System.out.println("변환된 섭씨온도 : " + cels);
  }
}
