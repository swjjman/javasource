package ch4;

public class StudentEx2 {

  public static void main(String[] args) {
    // Student2 객체 생성
    Student2 obj = new Student2(
      "20231423",
      "김철수",
      "서울시 구로구",
      "010-4568-1234"
    );
    // 직접접근 불가(private)
    // obj.id = "20231423";
    System.out.println(obj);

    // 주소 변경
    obj.changeAddr("서울시 중랑구");
    obj.setAddr("서울시 중랑구");
    // 주소 변경 확인
    System.out.println(obj);
    // 핸드폰 변경
    obj.changeHp("010-6987-7890");
    obj.setHp("010-6987-7890");
    // 핸드폰 변경 확인
    System.out.println(obj);

    Student2 obj2 = new Student2();
    obj2.setId("20247890");
    obj2.setName("박지성");
    obj2.setAddr("경기도 성남시");
    obj2.setHp("010-7890-1234");
    System.out.println(obj2);

    Student2 obj3 = new Student2("20245812", "김진수", "경기도 수원시");
    System.out.println(obj3);
  }
}
