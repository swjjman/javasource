package array;

public class ArrayEx3 {

  public static void main(String[] args) {
    // int score[] = new int[5];
    // score[0] = 98;
    // score[1] = 88;
    // score[2] = 78;
    // score[3] = 68;
    // score[4] = 58;

    // 배열의 초기 값이 정해진 경우 , 초기 값이 정해지면 [] 숫자 X
    int score[] = new int[] { 98, 88, 78, 68, 58 };
    // 가장 간단해서 많이씀.
    int score2[] = { 98, 88, 78, 68, 58 };
    // 배열 사이즈 변경 불가능 = 처음에 생성된 크기 변경하는 건 불가능
    // 더 큰 배열을 생성 = > 기존 배열 새로운 배열에 복사

    // 2차원 배열
    int score3[][] = { { 78, 98 }, { 88, 68 } };
    for (int i = 0; i < score3.length; i++) {
      for (int j = 0; j < score3[i].length; j++) {
        System.out.println(score3[i][j] + "\t");
      }
      System.out.println();
    }

    for (int[] arr : score3) {
      for (int num : arr) {
        System.out.print(num + "\t");
      }
      System.out.println();
    }
  }
}
