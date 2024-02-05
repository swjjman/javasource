package exam;

import java.time.LocalDateTime;

public class Board {

  // 글번호, 제목, 글내용, 작성자, 작성날짜, 수정날짜

  private int num;
  private String title;
  private String content;
  private String id;
  private LocalDateTime regdate;
  private LocalDateTime lastmodifieddate;

  public Board() {}

  public Board(int num, String title, String content, String id) {
    this.num = num;
    this.title = title;
    this.content = content;
    this.id = id;
  }
}
