import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a non-negative integer:");
    long input = scanner.nextLong();
    scanner.close();

    long factorial = 1;

    if (input < 0) {
      System.out.println("Provided number should be non-negative");
    } else if (input == 0 || input == 1) {
      System.out.println("Factorial: " + factorial);
    } else {
      for (int i = 1; i <= input; i++) {
        try {
          factorial = Math.multiplyExact(factorial, i);
        } catch (ArithmeticException e) {
          System.out.println("Factorial of provided number is bigger than " + Long.MAX_VALUE);
          return;
        }
      }
      System.out.println("Factorial: " + factorial);
    }
  }
}
