package inheritance;

// 원은 점이다 -> Circle is a Point
// 원은 점을 가지고 있다 -> Circle has a Point

// 둘 중 맞는 말로 상속, 포함 사용 결정

// 상속 관계(isa)
// public class Circle extends Point{

//   int x; // 원점의 x좌표
// //   int y; // 원점의 y좌표
//   int r; // 반지름
// }

//포함 관계(hasa)
//한 클래스의 멤버변수로 다른 클래스의 타입의 참조 변수를 선언

public class Circle {

  Point p = new Point();
  int r;
}
