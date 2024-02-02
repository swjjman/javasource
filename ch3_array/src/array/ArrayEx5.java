package array;

import java.util.Arrays;

public class ArrayEx5 {

  // sout , (Arrays.toString()) ;
  public static void main(String[] args) {
    //  배열명 arr 선언, 생성
    //  1,2,3,4,5

    int arr[] = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(arr));

    // 기존 배열의 arr 크기의 2배를 가지는 새로운 배열 생성

    int temp[] = new int[arr.length * 2];

    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }
    //             원본배열명, 복사위치, 복사배열명 , 복사위치 , 원본 배열의 몇개까지

    int temp2[] = new int[arr.length * 2];
    System.arraycopy(arr, 0, temp2, 5, arr.length);
    System.out.println(Arrays.toString(temp2));
  }
}
