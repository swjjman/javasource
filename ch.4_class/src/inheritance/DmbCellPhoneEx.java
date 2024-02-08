package inheritance;

public class DmbCellPhoneEx {

  public static void main(String[] args) {
    DmbCellPhone dmbCellPhone = new DmbCellPhone();
    dmbCellPhone.model = "삼성";
    dmbCellPhone.color = "black";
    dmbCellPhone.channel = 7;
    dmbCellPhone.poweron();
    dmbCellPhone.turnonDmb();
    dmbCellPhone.changeChannelDmb(16);
    dmbCellPhone.bell();
    dmbCellPhone.sendVoice("안녕하세요.");
    dmbCellPhone.receiveVoice("반갑습니다.");
    dmbCellPhone.hangup();
  }
}
