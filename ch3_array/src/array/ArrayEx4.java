package array;

import java.util.Arrays;

public class ArrayEx4 {

  // sout , (Array.toString()) ;
  public static void main(String[] args) {
    //  'a', 'b', 'c', 'd' char 1차원 선언, 생성

    char arr[] = { 'a', 'b', 'c', 'd' };
    System.out.println(arr);

    int intarr[] = { 78, 88, 9, 86, 55 };
    System.out.println(intarr);
    System.out.println(Arrays.toString(intarr)); //

    // 배열 복사
    // 더 큰 배열을 생성 = > 기존 배열 새로운 배열에 복사

    int temp[] = new int[intarr.length * 2];
    for (int i = 0; i < intarr.length; i++) {
      temp[i] = intarr[i];
    }
    intarr = temp;
    System.out.println("복사 후 " + Arrays.toString(intarr));

    // "abc", "def", "hij", "apple"

    String strarr[] = { "abc", "def", "hij", "apple" };
    System.out.println(strarr);
    System.out.println(Arrays.toString(strarr));
  }
}
