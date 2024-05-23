package devices;
public class TV extends ElectronicDevice {

  private MonitorTube tube;

  public TV() {
    this.tube = new MonitorTube(this);
  }

  public void on() {
    super.on();
    System.out.println("TV is on.");
    tube.on();
  }
  
  public void off() {
    super.off();
    System.out.println("TV is off.");
    tube.off();
  }

  public MonitorTube getTube() {
    return tube;
  }

}
