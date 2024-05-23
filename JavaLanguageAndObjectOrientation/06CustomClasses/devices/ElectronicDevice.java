package devices;

import java.util.ArrayList;

public abstract class ElectronicDevice {
  private boolean isOn;
  private int watt;

  public int getWatt() {
    return watt;
  }

  public void setWatt(int watt) {
    this.watt = watt;
  }

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
