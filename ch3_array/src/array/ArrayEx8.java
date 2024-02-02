package array;

import java.util.Arrays;

public class ArrayEx8 {

  public static void main(String[] args) {
    // 45개 정수값을 저장하기 위한 배열 생성
    // 1~45 담기 for문

    int arr[] = new int[45];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    // i : 자리를 바꿀 대상 위치번호
    for (int i = 0; i < 6; i++) {
      int num = (int) (Math.random() * 45);

      int temp = arr[i];
      arr[i] = arr[num];
      arr[num] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}
