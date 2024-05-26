import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import devices.ElectronicDevice;
import devices.Radio;
import devices.TV;

public class Application {
  public static void main(String[] args) {
    ElectronicDevice ea1 = new Radio();
    ea1.setWatt(200);
    ElectronicDevice ea2 = new Radio();
    ea2.setWatt(20);
    ElectronicDevice tv = new TV();
    tv.setWatt(300);
    Comparator<ElectronicDevice> c = new ElectronicDeviceWattComparator();
    // System.out.println(c.compare(ea1, ea2));
    // System.out.println(c.compare(ea2, ea1));

    ArrayList<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
    devices.add(ea2);
    devices.add(ea1);
    devices.add(tv);

    // System.out.println(findMostPowerConsumingElectronicDevice(devices));
    devices.sort(c);
    // System.out.println(devices);

    Ship ship = new Ship();

    for (ElectronicDevice electronicDevice : devices) {
      ship.load(electronicDevice);
    }

    System.out.println(ship.getDevices() + " size: " + ship.getDevices().size());
    ship.removePowerConsumingElectronicDevices();
    System.out.println(ship.getDevices() + " size: " + ship.getDevices().size());
  }

  public static ElectronicDevice findMostPowerConsumingElectronicDevice(ArrayList<ElectronicDevice> devices) {
    Comparator<ElectronicDevice> comparator = new ElectronicDeviceWattComparator();
    ElectronicDevice foundedDevice = Collections.max(devices, comparator);
    return foundedDevice;
  }

  private static class ElectronicDeviceWattComparator implements Comparator<ElectronicDevice> {
    @Override
    public int compare(ElectronicDevice ea1, ElectronicDevice ea2) {
      return Integer.compare(ea1.getWatt(), ea2.getWatt());
    }
  }
}
