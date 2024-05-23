import devices.ElectronicDevice;
import devices.Firebox;
import devices.IceMachine;
import devices.Radio;
import devices.TV;

public class Application {
  public static void main(String[] args) {
    Radio grandmasOldRadio = new Radio();
    grandmasOldRadio.on();
    Radio myNewRadio = new Radio();
    myNewRadio.on();
    Radio anotherOneRadio = new Radio();
    anotherOneRadio.on();

    // System.out.println(grandmasOldRadio.isOn());
    // System.out.println(grandmasOldRadio.isOn());
    // System.out.println(grandmasOldRadio.getVolume());
    // grandmasOldRadio.volumeUp();
    // grandmasOldRadio.volumeUp();
    // grandmasOldRadio.volumeDown();
    // grandmasOldRadio.volumeUp();
    // grandmasOldRadio.setModulation(Modulation.AM);
    // System.out.println(grandmasOldRadio.toString());
    // grandmasOldRadio.setModulation(Modulation.FM);
    // grandmasOldRadio.setFrequency(91.1);
    // System.out.println(grandmasOldRadio.toString());
    // System.out.println(grandmasOldRadio.getVolume());
    // System.out.println(grandmasOldRadio.toString());
    // System.out.println(grandmasOldRadio);

    Ship firstShip = new Ship();
    Ship secondShip = new Ship();

    firstShip.load(new Radio());
    firstShip.load(new Radio());
    firstShip.load(new Radio());
    firstShip.load(new Radio());
    firstShip.load(new Radio());
    firstShip.load(new Radio());
    firstShip.load(anotherOneRadio);
    firstShip.load(grandmasOldRadio);
    firstShip.load(myNewRadio);

    secondShip.load(new TV());
    secondShip.load(new TV());
    secondShip.load(new TV());
    secondShip.load(new TV());
    secondShip.load(new TV());

    ElectronicDevice iceMachine = new IceMachine();
    iceMachine.on();

    secondShip.load(iceMachine);
    secondShip.load(new IceMachine());

    Firebox firebox = new Firebox();
    Firebox anotherFirebox = new Firebox();
    firstShip.load(firebox);
    secondShip.load(anotherFirebox);

    System.out.println(firstShip);
    System.out.println(secondShip);
    firstShip.holiday();
    secondShip.holiday();
    System.out.println(firstShip);
    System.out.println(secondShip);

    firstShip.printLoadingList();
    secondShip.printLoadingList();
  }
}
