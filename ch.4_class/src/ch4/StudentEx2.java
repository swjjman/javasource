package ch4;

public class StudentEx2 {

  public static void main(String[] args) {
    // 객체(인스턴스) 생성
    Student2 obj = new Student2(
      "20231423",
      "김철수",
      "서울시 구로구",
      "010-1234-1234"
    );
    // 직접 접근 불가 (private)
    // obj.id = "20231423";
    System.out.println(obj);

    obj.changeAddr("서울시 중랑구");
    // 주소 변경 확인
    System.out.println(obj);

    obj.changeHp("010-2222-2222");
    System.out.println(obj);

    Student2 obj2 = new Student2(
      "20234423",
      "박철수",
      "서울시 은평구",
      "010-1234-1234"
    );
    System.out.println(obj2);

    Student2 obj3 = new Student2("20245423", "김진수", "경기도 수원");
    System.out.println(obj3);
  }
}
