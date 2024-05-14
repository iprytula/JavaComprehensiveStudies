public class Firebox extends ElectronicDevice {

  Firebox() {
    this.on();
  }

  @Override
  public void off() {
    System.out.println("Firebox should be always on!");
  }

}
