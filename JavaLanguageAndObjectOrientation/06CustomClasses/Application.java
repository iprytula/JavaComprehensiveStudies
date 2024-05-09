public class Application {
  public static void main(String[] args) {
    Radio grandmasOldRadio = new Radio();
    System.out.println(grandmasOldRadio.isOn());
    grandmasOldRadio.on();
    System.out.println(grandmasOldRadio.isOn());
    System.out.println(grandmasOldRadio.getVolume());
    grandmasOldRadio.volumeUp();
    grandmasOldRadio.volumeUp();
    grandmasOldRadio.volumeDown();
    grandmasOldRadio.volumeUp();
    grandmasOldRadio.setModulation(Modulation.AM);
    System.out.println(grandmasOldRadio.toString());
    grandmasOldRadio.setModulation(Modulation.FM);
    grandmasOldRadio.setFrequency(91.1);
    System.out.println(grandmasOldRadio.toString());
    System.out.println(grandmasOldRadio.getVolume());
    System.out.println(grandmasOldRadio.toString());
    System.out.println(grandmasOldRadio);
    grandmasOldRadio.off();
  }
}
