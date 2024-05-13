import java.util.ArrayList;

public class Application {
  public static void main(String[] args) {
    Radio grandmasOldRadio = new Radio();
    Radio myNewRadio = new Radio();
    // myNewRadio.on();
    Radio anotherOneRadio = new Radio();

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
    // iceMachine.on();

    secondShip.load(iceMachine);
    secondShip.load(new IceMachine());

    System.out.println(firstShip);
    System.out.println(secondShip);
  }
}
