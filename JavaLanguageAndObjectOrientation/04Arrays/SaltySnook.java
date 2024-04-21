public class SaltySnook {

  final static int NUMBER_OF_OCCURRENCES = 4;

  static boolean isProbablyApproaching(String[] signs) {
    if (signs == null || signs.length == 0) {
      throw new IllegalArgumentException("The \"signs\" array must not be null or empty.");
    }

    for (int i = 0, count = 1; i < signs.length; i++) {
      String currentSign = signs[i];
      String nextSign;

      try {
        nextSign = signs[i + 1];
      } catch (ArrayIndexOutOfBoundsException e) {
        return false;
      }

      if (currentSign.equals(nextSign)) {
        count++;

        if (count == NUMBER_OF_OCCURRENCES) {
          return true;
        }
      } else {
        count = 1;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    String[] signs1 = { "F", "DO", "MOS", "MOS", "MOS", "MOS", "WES" };
    System.out.println(isProbablyApproaching(signs1));

    String[] signs2 = { "F", "DO", "MOS", "MOS", "WES", "MOS", "MOS" };
    System.out.println(isProbablyApproaching(signs2));
  }
}
