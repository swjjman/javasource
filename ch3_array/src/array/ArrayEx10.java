package array;

// 알고리즘 - 정렬  구글 선택정렬 버블정렬 힙정렬

import java.util.Arrays;

public class ArrayEx10 {

  public static void main(String[] args) {
    int arr[] = { 25, 85, 55, 65, 5, 3 };

    // 자바가 제공하는 sort
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
