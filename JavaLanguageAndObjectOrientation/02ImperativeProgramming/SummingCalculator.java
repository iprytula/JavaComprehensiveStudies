import java.util.Scanner;

public class SummingCalculator {
  public static void main(String[] args) {
    int input;
    int sum = 0;
    final int END_OF_INPUT = 0;

    do {
      input = new Scanner(System.in).nextInt();
      sum += input;
    } while (input != END_OF_INPUT);

    System.out.println("Sum: " + sum);
  }
}
