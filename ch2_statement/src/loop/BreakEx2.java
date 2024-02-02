package loop;

public class BreakEx2 {

  public static void main(String[] args) {
    int i = 0;
    while (true) {
      i = (int) (Math.random() * 6) + 1;
      if (i == 6) break;
    }
    System.out.println("종료");
  }
}
