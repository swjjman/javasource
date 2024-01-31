package operator;

// 단항 연산자 : 부호 => 양수, 음수, 증감연산자 => ++, --
//                        ++ => 변수 +1,  -- => 변수 -1
public class IncDecEx1 {

  public static void main(String[] args) {
    int x = 10, y = 20;
    System.out.printf("x = " + (x++)); // x=x;  x=x+1;
    System.out.printf("x = " + (x++));

    System.out.printf("x=%d,  y=%d\n", x, y);

    System.out.printf("x = " + (++x)); // x=x+1;
    System.out.printf("x = " + (++y)); // y=y+1;
    System.out.printf("x=%d,  y=%d\n", x, y);
  }
}
