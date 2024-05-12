public class TV {

  private MonitorTube tube;
  private boolean isOn;

  TV() {
    this.tube = new MonitorTube(this);
  }

  public void on() {
    isOn = true;
    System.out.println("TV is on.");
    tube.on();
  }
  
  public void off() {
    isOn = false;
    System.out.println("TV is off.");
    tube.off();
  }

  public MonitorTube getTube() {
    return tube;
  }

  public boolean isOn() {
    return isOn;
  }

}
