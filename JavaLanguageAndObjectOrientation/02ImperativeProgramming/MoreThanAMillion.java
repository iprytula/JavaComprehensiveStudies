import java.util.Scanner;

public class MoreThanAMillion {

  public static void main(String[] args) {
    double a, b, c;
    double summary;
    boolean canPlay;

    System.out.println("Enter first value:");
    a = new Scanner(System.in).nextDouble();
    System.out.println("Enter second value");
    b = new Scanner(System.in).nextDouble();
    System.out.println("Enter third value");
    c = new Scanner(System.in).nextDouble();

    summary = a + b + c;
    canPlay = summary > 1_000_000;

    System.out.println(canPlay);
  }

}
