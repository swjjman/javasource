package ch4;

public class MemberCall {

  int iv = 10; // 인스턴스 변수
  static int cv = 20; // 클래스 변수

  // 클래스 메소드
  static void staticMethod1() {
    //System.out.println(iv);
    System.out.println(cv);
  }

  void instanceMethod1() {
    System.out.println(iv);
    System.out.println(cv);
  }
}
