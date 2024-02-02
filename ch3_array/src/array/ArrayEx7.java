package array;

import java.util.Arrays;

public class ArrayEx7 {

  public static void main(String[] args) {
    int numarr[] = new int[6];

    for (int i = 0; i < numarr.length; i++) {
      numarr[i] = i;
    }
    System.out.println(Arrays.toString(numarr));

    // 무작위로 숫자의 위치 변경
    for (int i = 0; i < 100; i++) {
      // 0~9 임의 숫자 추출
      int pos = (int) (Math.random() * 46);

      int temp = numarr[0];
      numarr[0] = numarr[pos];
      numarr[pos] = temp;
    }
    System.out.println(Arrays.toString(numarr));
  }
}
