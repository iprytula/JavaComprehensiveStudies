import java.util.Random;

public class Windy {
  final static int LENGTH         = 5;
  final static int MAX_WIND_SPEED = 200;
  final static int MAX_DEGREE     = 360;
  static int[] windSpeed          = new int[LENGTH];
  static int[] windDirection      = new int[LENGTH];

  public static void main(String[] args) {
    Random random = new Random();
    String output = "";

    for (int i = 0; i < LENGTH; i++) {
      windSpeed[i] = random.nextInt(MAX_WIND_SPEED);
      windDirection[i] = random.nextInt(MAX_DEGREE);
    }

    for (int i = 0; i < LENGTH; i++) {
      output += 
        "Wind speed " + windSpeed[i] + " km/h" + 
        " and wind direction " + windDirection[i] + "°" +
        (i != LENGTH - 1 ? ", " : "");
    }

    System.out.println(output);
  }
}
