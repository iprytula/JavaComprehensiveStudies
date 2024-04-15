public class LengthOfMonth {

  public static void main(String[] args) {
    int month = new java.util.Scanner(System.in).nextInt();
    int year = new java.util.Scanner(System.in).nextInt();
    boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

    int days;
    switch (month) {
      case 2:
        days = isLeapYear ? 29 : 28;
        break;
      case 4, 6, 9, 11: days = 30;
        break;
      default:
        days = 31;
    }
  }

}
