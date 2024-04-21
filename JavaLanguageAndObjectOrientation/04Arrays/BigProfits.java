import java.security.InvalidParameterException;

public class BigProfits {
  private static int count5PercentJumps(int... sales) {
    int count = 0;

    for (int i = 1; i < sales.length; i++) {
      int prevSale = sales[i - 1];
      int currentSale = sales[i];
      boolean isCurrent5PercentsMore = (prevSale * 0.05 + prevSale) < currentSale;

      if (isCurrent5PercentsMore) count++;
    }

    return count;
  }
  
  public static void main(String[] args) {
    if (args == null || args.length == 0) {
      throw new InvalidParameterException("You should enter at least 1 parameter");
    }

    int[] numbers = new int[args.length];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(args[i]);
    }

    System.out.println(count5PercentJumps(numbers));
  }
}
