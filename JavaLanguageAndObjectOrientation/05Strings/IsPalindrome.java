import java.util.Scanner;

public class IsPalindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input;
    System.out.println("Input string to check if it is a palindrome or not:");
    do {
      input = scanner.nextLine().trim();
      System.out.println(isStringPalindrome(input));
    } while (!input.equals("."));
    scanner.close();
  }

  static boolean isStringPalindrome(String string) {
    String filteredString = string.replaceAll("[^a-zA-Z]", "").toLowerCase();
    String inputString = new StringBuffer(filteredString).toString();
    String reversedString = new StringBuffer(inputString).reverse().toString();

    return inputString.toString().equals(reversedString.toString());
  }
}
