public class ContainsCandyName {
  static boolean containsCandyName(String text) {
    text = text.toLowerCase();
    String[] candyNames = { "starburst", "snackers", "n&n", "cold tamales" };
    for (String candyName : candyNames)
      if (text.contains(candyName))
        return true;
    return false;

  }

  public static void main(String[] args) {
    String msg1 = "Starburst is so delicious.";
    System.out.println(containsCandyName(msg1));
    String msg2 = "I only like warm milk.";
    System.out.println(containsCandyName(msg2));
  }

}
