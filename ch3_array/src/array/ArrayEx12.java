package array;

public class ArrayEx12 {

  // RUN - add Configuration
  // "args": "${command:SpecifyProgramArgs}"
  public static void main(String[] args) {
    for (String str : args) {
      System.out.println(str);
      System.out.println(str.length());
    }
  }
}
