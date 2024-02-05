package exam;

public class Circle {

  // 반지름 (3.5) - radius

  private double radius;

  public Circle() {}

  public Circle(double radius) {
    this.radius = radius;
  }

  // 반지름 * 반지름 * 3.14 결과 값 리턴

  double getArea() {
    return this.radius * radius * 3.14;
  }
}
