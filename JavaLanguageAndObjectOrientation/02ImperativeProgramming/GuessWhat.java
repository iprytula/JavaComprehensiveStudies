public class GuessWhat {
  public static void main(String[] args) {
    int number = (int) (Math.random() * 5 + 1);
    while (true) {
      System.out.println("What number do I have in mind between 1 and 5?");
      int guess = new java.util.Scanner(System.in).nextInt();
      if (number == guess) {
        System.out.println("Good guess!");
        break; // End of loop
      }
      else if (number > guess) {
        System.out.println("Nope, my number is larger than yours!");
      }
      else if (number < guess) {
        System.out.println("Nope, my number is smaller than yours!");
      }
    }
  }
}