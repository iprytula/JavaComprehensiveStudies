public class Avg {
  public static void main(String[] args) {
    double[] prices = { 1.23, 4.94, 9.33, 3.91, 6.34 };

    System.err.println(Avg.avg(prices));
  }

  static double avg(double[] numbers) {
    if (numbers == null || numbers.length == 0) {
      throw new IllegalArgumentException("Array null or empty");
    }

    double sum = 0;

    for (double number : numbers) {
      sum += number;
    }

    return sum / numbers.length;
  }
}
