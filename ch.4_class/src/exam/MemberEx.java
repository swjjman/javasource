package exam;

public class MemberEx {

  public static void main(String[] args) {
    // 회원 객체 생성 -> 생성자 호출
    // 아이디, 비밀번호, 이름 필수
    // 아이디, 비밀번호, 이름, 나이, 직업

    // grade, point => 마트 규칙에 따라 변경

    Member member1 = new Member("lsee", "1234", "홍길동");

    Member member2 = new Member("asd", "1234", "성춘향", 23, "회사원");
  }
}
