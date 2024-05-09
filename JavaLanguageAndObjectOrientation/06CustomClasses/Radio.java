import java.util.HashMap;
import java.util.Map;

public class Radio {

  private boolean isOn;
  private int volume;
  private double frequency;
  private Modulation modulation;
  private final int MAX_VOLUME = 100;
  private final int MIN_VOLUME = 0;
  private final double MIN_FREQUENCY_FOR_AM = 26.1;
  private final double MAX_FREQUENCY_FOR_AM = 148.5;
  private final double MIN_FREQUENCY_FOR_FM = 87.5;
  private final double MAX_FREQUENCY_FOR_FM = 108;
  private double minFrequency;
  private double maxFrequency;
  static Map<String, Double> stations = new HashMap<>();

  Radio() {
    setStations();
  }

  Radio(double frequency) {
    this();
    setFrequency(frequency);
  }

  Radio(String stationName) {
    this(stations.get(stationName));
  }

  private static void setStations() {
    stations.put("Jazz FM", 91.1);
    stations.put("Rock 101", 102.0);
    stations.put("Classical Archives", 98.5);
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

  public int getVolume() {
    return volume;
  }

  public void volumeUp() {
    if (volume == 100) {
      throw new IllegalStateException("Max volume is " + MAX_VOLUME);
    }

    volume++;
  }

  public void volumeDown() {
    if (volume == 0) {
      throw new IllegalStateException("Min volume is " + MIN_VOLUME);
    }

    volume--;
  }

  public void setFrequency(double frequency) {
    this.frequency = frequency;
  }

  public double getFrequency() {
    return frequency;
  }

  public void setModulation(Modulation modulation) {
    if (modulation == Modulation.AM) {
      minFrequency = MIN_FREQUENCY_FOR_AM;
      maxFrequency = MAX_FREQUENCY_FOR_AM;
    } else if (modulation == Modulation.FM) {
      minFrequency = MIN_FREQUENCY_FOR_FM;
      maxFrequency = MAX_FREQUENCY_FOR_FM;
    }
    this.modulation = modulation;
  }

  public Modulation getModulation() {
    return modulation;
  }

  public void setOn(boolean isOn) {
    this.isOn = isOn;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public double getMinFrequency() {
    return minFrequency;
  }

  public void setMinFrequency(double minFrequency) {
    this.minFrequency = minFrequency;
  }

  public double getMaxFrequency() {
    return maxFrequency;
  }

  public void setMaxFrequency(double maxFrequency) {
    this.maxFrequency = maxFrequency;
  }

  public String toString() {
    return String.format("Radio[volume=%d, frequency=%f, modulation=%s, minFrequency=%f, maxFrequency=%f, isOn: %b]", getVolume(), getFrequency(), getModulation(), getMinFrequency(), getMaxFrequency(), isOn());
  }

}
