package array;

public class ArrayEx6 {

  public static void main(String[] args) {
    // 학생 10명의 점수를 관리
    int score[] = { 79, 88, 91, 33, 100, 45, 55, 89, 25, 74 };

    // 최고 점수 / 최저점수 / 총합 / 평균
    int max = score[0];
    int min = score[0];
    int sum = score[0];
    // min, max 변수 사용 / score[0] 값을 담기
    for (int i = 1; i < score.length; i++) {
      if (max < score[i]) max = score[i];
      if (min > score[i]) min = score[i];
      sum += score[i];
    }
    System.out.printf("최고점수 %d, 최저점수 %d\n", max, min);
    double avg = sum / (double) score.length;
    System.out.printf("점수총합 %d, 평균 %.2f\n", sum, avg);
  }
}
