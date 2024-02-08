package inheritance;

// 관계 1. 상속 2. 포함

// TV = VCR
public class Tvcr extends Tv {

  Vcr vcr = new Vcr();
  int counter = vcr.counter;

  void play() {
    vcr.play();
  }

  void stop() {
    vcr.stop();
  }
}
