package ch4;

public class Car {

  // 제조사, 이름, 옵션, 속도 => 필요한 것들만
  // 전진한다. 후진한다 = > 메소드
  // 변수 값 변경 => 메소드

  String company;
  String model;
  int maxSpeed;

  void forward() {
    System.out.println("전진한다");
  }

  void backward() {
    System.out.println("후진한다");
  }
}
