import java.util.Arrays;
import java.util.Random;

public class ReverseArray {
  private static Random random = new Random();

  private static int[] createArray(int maxLength) {
    int[] arr = new int[maxLength];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(20);
    }

    return arr;
  }

  private static int[] reverseArray(int[] arr) {
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("The array must not be null or empty.");
    }
    int[] reversed = new int[arr.length];

    for (int i = 0; i < reversed.length; i++) {
      reversed[i] = arr[arr.length - 1 - i];
    }

    return reversed;
  }

  public static void main(String[] args) {
    int maxLength = random.nextInt(4, 20);
    int[] originalArray = createArray(maxLength);
    int[] reversedArray = reverseArray(originalArray);

    System.out.println("Original Array: " + Arrays.toString(originalArray));
    System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
  }
}
