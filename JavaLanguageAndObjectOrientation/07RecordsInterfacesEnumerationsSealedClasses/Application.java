import java.util.Comparator;

import devices.ElectronicDevice;
import devices.Radio;

public class Application {
  public static void main(String[] args) {
    ElectronicDevice ea1 = new Radio();
    ea1.setWatt(200);
    ElectronicDevice ea2 = new Radio();
    ea2.setWatt(20);
    Comparator<ElectronicDevice> c = new ElectronicDeviceWattComparator();
    System.out.println(c.compare(ea1, ea2));
    System.out.println(c.compare(ea2, ea1));
  }
}
