import java.util.ArrayList;
import java.util.function.Predicate;

import devices.ElectronicDevice;
import devices.Radio;
import devices.TV;

public class Ship {

  public static class AsciiArt {
    public static final String RADIO = " .-.\n|o.o|\n|:_:|";
    public static final String TV = " \\  /\n _\\/_\n|    |\n|____|";
    public static final String SOCKET = """
              ____
         ____|    \\
        (____|     `._____
         ____|       _|___
        (____|     .'
             |____/""";
  }

  private ArrayList<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
  private final int MAXIMUM_POWER_CONSUMPTION = 200;

  public void load(ElectronicDevice device) {
    if (device instanceof Radio && ((Radio)device).getVolume() > 0) {
      throw new IllegalArgumentException("Radio is broken!");
    }
    if (device instanceof Radio) {
      System.out.println("Remember to pay license fee!");
    }
    this.devices.add(device);
  }

  public ArrayList<ElectronicDevice> getDevices() {
    return devices;
  }

  public void holiday() {
    for (ElectronicDevice device : devices) {
      device.off();
    }
  }

  @Override
  public String toString() {
    return "Ship[" + super.hashCode() + "][loadedDevices=" + getDevices().size() + "][devicesOn=" + ElectronicDevice.numberOfElectronicDevicesSwitchedOn(devices) + "]";
  }

  public void printLoadingList() {
    System.out.println("--------------------------------------");
    for (ElectronicDevice device : devices) {
      if (device instanceof Radio) {
        System.out.println(AsciiArt.RADIO);
      } else if (device instanceof TV) {
        System.out.println(AsciiArt.TV);
      } else {
        System.out.println(AsciiArt.SOCKET);
      }
    }
    System.out.println("--------------------------------------");
  }

  public void removePowerConsumingElectronicDevices() {
    devices.removeIf(new IsPowerConsumptionGreaterThanMax());
  }

  class IsPowerConsumptionGreaterThanMax implements Predicate<ElectronicDevice> {
    @Override
    public boolean test(ElectronicDevice device) {
      return device.getWatt() > MAXIMUM_POWER_CONSUMPTION;
    }
  }

}
