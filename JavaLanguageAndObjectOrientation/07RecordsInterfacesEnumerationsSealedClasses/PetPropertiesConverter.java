import java.util.Properties;

public class PetPropertiesConverter {

  public static Properties convertToProperties(Object pet) {
    Properties properties = new Properties();

    if (pet == null) {
      return properties;
    }

    if (pet instanceof MischiefMonkey monkey) {
      if (!monkey.isMutinous()) {
        properties.setProperty("name", monkey.name());
      }
    } else if (pet instanceof FeistyParrot parrot) {
      if (!parrot.isMutinous()) {
        properties.setProperty("name", parrot.name());
        properties.setProperty("favoritePhrase", parrot.favoritePhrase());
      }
    }

    return properties;
  }

  // Records for testing
  public record MischiefMonkey(String name, boolean isMutinous) {
  }

  public record FeistyParrot(String name, String favoritePhrase, boolean isMutinous) {
  }

  // Main method for testing the implementation
  public static void main(String[] args) {
    MischiefMonkey monkey1 = new MischiefMonkey("Jack", true);
    FeistyParrot parrot1 = new FeistyParrot("Captain Squawk", "Avast, ye scallywags!", false);
    MischiefMonkey monkey2 = new MischiefMonkey("Barbossa", false);
    FeistyParrot parrot2 = new FeistyParrot("Polly", "Pieces of eight!", true);
    FeistyParrot parrot3 = new FeistyParrot("Marauder", "Walk the plank!", false);

    System.out.println(convertToProperties(monkey1)); // {}
    System.out.println(convertToProperties(parrot1)); // {favoritePhrase=Avast, ye scallywags!, name=Captain Squawk}
    System.out.println(convertToProperties(monkey2)); // {name=Barbossa}
    System.out.println(convertToProperties(parrot2)); // {}
    System.out.println(convertToProperties(parrot3)); // {favoritePhrase=Walk the plank!, name=Marauder}
  }
}
