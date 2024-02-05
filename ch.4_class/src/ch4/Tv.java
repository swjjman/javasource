package ch4;

public class Tv {

  /* 클래스 : 설계도
   * 객체 : 실체 사용
   */

  // 색상, 전원상태, 채널, 볼륨,크기

  String color;
  int channel;
  boolean power;

  void channelUp() {
    channel++;
  }

  void channelDown() {
    channel--;
  }

  Tv() {}
}
