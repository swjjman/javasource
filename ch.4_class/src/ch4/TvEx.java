package ch4;

public class TvEx {

  public static void main(String[] args) {
    Tv tv = new Tv();
    System.out.println(tv.color);
    System.out.println(tv.channel);
    System.out.println(tv.power);

    tv.color = "black";
    tv.channel = 3;
    tv.power = true;

    tv.channelUp();

    System.out.println(tv.color);
    System.out.println(tv.channel);
    System.out.println("현재 채널" + tv.power);
    // 채널 번호 직접 입력

  }
}
