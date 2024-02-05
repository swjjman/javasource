package ch4;

public class StudentEx {

  public static void main(String[] args) {
    // 객체(인스턴스) 생성
    Student student = new Student();

    // 생성된 인스턴스에 값 할당
    student.id = "20241212";
    student.name = "홍길동";
    student.addr = "서울시 종로구";
    student.hp = "010-1234-1234";

    System.out.println(student.id);
    System.out.println(student.name);
    System.out.println(student.addr);
    System.out.println(student.hp);

    // 생성자 호출
    Student student2 = new Student();

    student2.id = "20241111";
    student2.name = "성춘향";
    student2.addr = "서울시 은평구";
    student2.hp = "010-1234-1234";

    System.out.println(student2.id);
    System.out.println(student2.name);
    System.out.println(student2.addr);
    System.out.println(student2.hp);
  }
}
