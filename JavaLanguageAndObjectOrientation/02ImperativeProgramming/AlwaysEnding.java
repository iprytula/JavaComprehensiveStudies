public class AlwaysEnding {
  public static void main(String[] args) {
    double t = Math.random() * 10;

    while (t > 0) {
      t = t < 1 ? t * 2 : t - 1;
      System.out.println(t);
    }
  }
}
