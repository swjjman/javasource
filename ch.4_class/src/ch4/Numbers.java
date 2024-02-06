package ch4;

public class Numbers {

  private int num[];

  public Numbers(int[] num) {
    this.num = num;
  }

  int getTotal() {
    int total = 0;
    for (int i : num) {
      total += i;
    }
    return total;
  }

  int getAverage() {
    return getTotal() / num.length;
  }
}
