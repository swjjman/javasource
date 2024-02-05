package exam;

public class Account {

  // 계좌번호, 이름, 잔액

  private String num;
  private String name;
  private int money;

  public Account() {}

  public Account(String num, String name, int money) {
    this.num = num;
    this.name = name;
    this.money = money;
  }
}
