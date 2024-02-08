package inheritance;

public class ChildEx {

  public static void main(String[] args) {
    Parent parent = new Parent(15);
    Child child = new Child(20);
    Child2 child2 = new Child2(25);
    GrandChild grandChild = new GrandChild(30);

    System.out.println("부모의 멤버 변수 child " + parent.getAge());
    System.out.println("부모의 멤버 변수 child2" + child.getAge());
    System.out.println("부모의 멤버 변수 " + child2.getAge());
    System.out.println("child 멤버 메소드 ");
    child.play();
    System.out.println(
      "Parent가 물려준 멤버변수 grandchild " + grandChild.getAge()
    );
    grandChild.play(); // Child가 물려준 멤버 메소드.

    // 오버라이딩 메소드

    parent.print();
    child.print();
    child2.print();
    grandChild.print();
  }
}
