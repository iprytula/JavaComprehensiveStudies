import java.util.Scanner;

public class DoYouAgree {

  public static void main(String[] args) {
    System.out.println("Do you agree?");
    String input = new Scanner(System.in).nextLine();

    switch (input) {
      case "ay", "aye", "ay, ay", "ja", "joo":
        System.out.println("Keep it up!");
        break;
      default:
        System.out.println("Don't you dare!");;
    }
  }

}
