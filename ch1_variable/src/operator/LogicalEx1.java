package operator;

//  && : 피연산자 양쪽 모두 true 여야 true 결과를 얻음
//  || : 피연산자 중 어느 한쪽만 true여도 true 결과를 얻음
public class LogicalEx1 {

  public static void main(String[] args) {
    // x는 10보다 크고, 20보다 작다.
    int x = 15;
    System.out.println(x > 10 && x < 20);

    int charcode = 'A';

    if ((charcode >= 65) && (charcode <= 90)) {
      System.out.println("대문자");

      char charcode2 = 'a';
      System.out.println(charcode2 >= 'a' && charcode2 <= 'z');

      //   i는 2의 배수 또는 3의 배수이다.

      int i = 12;
      System.out.println(i % 2 == 00 || i % 3 == 0);

      //   i는 2의 배수 또는 3의 배수이지만 6의 배수는 아니다.

      System.out.println((i % 2 == 00 || i % 3 == 0) && i % 6 != 0);
    }
  }
}
