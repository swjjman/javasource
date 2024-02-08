package inheritance;

public class CaptionTv extends Tv {

  // CaptionTv(){Super();}

  boolean caption;

  public CaptionTv(boolean power, int channel, boolean caption) {
    super(power, channel);
    this.caption = caption;
  }

  public CaptionTv(boolean caption) {
    this.caption = caption;
  }

  void displayCation(String text) {
    // if(caption!=true) == if(!caption)

    // if(caption == true)
    if (caption) {
      System.out.println(text);
    }
  }
}
