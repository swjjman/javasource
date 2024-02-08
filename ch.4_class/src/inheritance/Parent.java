package inheritance;

public class Parent {

  private int age;

  public Parent(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void print() {
    System.out.println("나이는" + age + "입니다.");
  }
}
