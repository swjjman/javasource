package loop;

//  continue 이후의 구문을 건너뛰게함

public class ContinueEx1 {

  public static void main(String[] args) {
    // for (int i = 0; i < 11; i++) {
    //   if (i % 3 == 0) continue;
    //   {
    // System.out.println(i);
  }

  {
    {
      System.out.println("\n\n");
      for (int i = 0; i < 11; i++) {
        if (i % 2 != 0) continue;
        System.out.println(i);
      }
    }
  }
}
