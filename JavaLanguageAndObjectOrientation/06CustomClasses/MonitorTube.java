public class MonitorTube {

  private TV tv;

  MonitorTube(TV tv) {
    this.tv = tv;
  }

  public void on() {
    System.out.println("Tube is on.");
  }
  
  public void off() {
    System.out.println("Tube is off.");
  }

  public TV getTV() {
    return tv;
  }

}
