public class TVMonitorTube {
  public static void main(String[] args) {
    TV tv = new TV();
    tv.on();
    tv.off();
    MonitorTube tube = new MonitorTube(tv);
    tube.on();
    tube.off();
    System.out.println(tube.getTV());
  }
}
