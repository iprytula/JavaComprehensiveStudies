public class CoinMachine {

  public static void main(String[] args) {
    System.out.println( "Please the enter the amount of money:" );
    double input = new java.util.Scanner( System.in ).nextDouble();
    int cents = (int) (input * 100);

    System.out.println(cents);

    System.out.println( cents / 200 + " x 2 Liretta" );
    cents %= 200;

    System.out.println( cents / 100 + " x 1 Liretta" );
    cents %= 100;

    System.out.println( cents / 50 + " x 50 Lirettacent" );
    cents %= 50;

    System.out.println( cents / 20 + " x 20 Lirettacent" );
    cents %= 20;

    System.out.println( cents / 10 + " x 10 Lirettacent" );
    cents %= 10;

    System.out.println( cents / 5 + " x 5 Lirettacent" );
    cents %= 5;

    System.out.println( cents / 2 + " x 2 Lirettacent" );
    cents %= 2;

    System.out.println( cents + " x 1 Lirettacent" );
  }

}
