package exam;

public class Account {

  // 계좌번호(110-11-12345), 계좌주 이름(홍길동), 잔액(100000)
  private String accountNo;
  private String owner;
  private int balance;

  public Account() {}

  public Account(String accountNo, String owner, int balance) {
    this.accountNo = accountNo;
    this.owner = owner;
    this.balance = balance;
  }

  // 예금하다
  // deposit
  int deposit(int amount) {
    // 잔액 = 잔액 + 예금액
    // balance = balance + amount;
    // return balance;
    return balance += amount;
  }

  // 출금하다
  // withdraw
  int withdraw(int amount) {
    // 잔액 = 잔액 - 출금액
    // balance = balance - amount;
    // return balance;
    return balance -= amount;
  }
}
