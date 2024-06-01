public class StringsToInteger {
  public static void main(String[] args) {
    String[] strings = { "1", "234", "333" };
    int[] ints1 = parseInts(strings); // [1, 234, 333]
    int[] ints2 = parseInts("1", "234", "333"); // [1, 234, 333]
    int[] ints3 = parseInts("1", "ll234", "3", null, "99"); // [1, 0, 3, 0, 99]
    int[] ints4 = parseInts("Person", "Woman", "Man", "Camera, TV"); // [0, 0, 0, 0]
  
    for (int i : ints4) {
      System.out.println(i);
    }
  }

  static int[] parseInts(String... numbers) {
    int[] ints = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      int number;
      try {
        number = Integer.parseInt(numbers[i]);
      } catch (NumberFormatException e) {
        number = 0;
      }
      ints[i] = number;
    }

    return ints;
  }
}
