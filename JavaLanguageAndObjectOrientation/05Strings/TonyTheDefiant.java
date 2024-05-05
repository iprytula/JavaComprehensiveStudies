import java.util.Scanner;

public class TonyTheDefiant {
  public static void main(String[] args) {
    final String endOfTheLoopInput = ".";
    String input;
    do {
      input = new Scanner(System.in).nextLine().trim();
      if (input.equalsIgnoreCase("no idea?")) {
        System.out.println("Aye!");
      } else if (input.endsWith("?")) {
        System.out.println(input + " No idea!");
      }
    } while (!input.equals(endOfTheLoopInput));
  }
}
