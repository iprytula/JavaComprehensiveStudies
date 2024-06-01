import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LongestLineInFile {
  public static void main(String[] args) {
    try {
      List<String> familyNames = Files.readAllLines(Paths.get("family-names.txt"));
      String longestName = "";

      for (String name : familyNames) {
        if (name.length() > longestName.length()) {
          longestName = name;
        }
      }

      System.out.println("Longest name is: \""+ longestName + "\". It's length is: " + longestName.length() + " digits.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}