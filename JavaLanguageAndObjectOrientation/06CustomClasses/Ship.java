import java.util.ArrayList;

public class Ship {

  private ArrayList<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();

  public void load(ElectronicDevice device) {
    if (device.isOn()) {
      throw new IllegalArgumentException("Loaded device should not be on");
    }
    if (device instanceof Radio) {
      System.out.println("Remember to pay license fee!");
    }
    this.devices.add(device);
  }

  public ArrayList<ElectronicDevice> getDevices() {
    return devices;
  }

  @Override
  public String toString() {
    return "Ship[" + super.hashCode() + "][loadedDevices=" + getDevices().size() + "]";
  }

}
