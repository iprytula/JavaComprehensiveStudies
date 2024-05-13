import java.util.ArrayList;

public class ElectronicDevice {
  private boolean isOn;

  public void on() {
    isOn = true;
  }

  public void off() {
    isOn = false;
  }

  public boolean isOn() {
    return isOn;
  }

  public static int numberOfElectronicDevicesSwitchedOn(ArrayList<ElectronicDevice> devices) {
    int switchedOnCount = 0;

    for (ElectronicDevice device : devices) {
      if (device.isOn()) {
        switchedOnCount++;
      }
    }

    return switchedOnCount;
  }
}
