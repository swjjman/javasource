package ch4;

// Singleton 패턴
// 단 하나의 객체만을 생성할 수 있도록 하는 패턴

public class SingletonEx {

  public static void main(String[] args) {
    // not visible
    // Singleton singleton = new Singleton();
    Singleton singleton = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    System.out.println(singleton == singleton2); //true
  }
}
