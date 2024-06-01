import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class PrintToFile {
  public static void main(String[] args) {
    try {
      File file = new File("current-date.txt");

      if (!file.createNewFile())
        System.out.println("file: " + file.getName() + " already exists.");

      try (PrintWriter printWriter = new PrintWriter(file.getName())) {
        printWriter.println(LocalDateTime.now());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
