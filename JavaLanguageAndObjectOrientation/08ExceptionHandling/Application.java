public class Application {
  public static void main(String[] args) {
    Radio radio = new Radio();

    try {
      radio.setWatt(100);
    } catch (IllegalWattException e) {
      e.printStackTrace();
    }

    System.out.println(radio);
  }
}
