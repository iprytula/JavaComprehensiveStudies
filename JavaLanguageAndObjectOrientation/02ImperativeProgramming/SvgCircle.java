import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class SvgCircle {

  public static void main(String[] args) {
    String fileName = "circle.svg"; // Define the name of the output file.
    int height = 400;
    int width = 1000;
    int positionX = 0;
    int positionY = 0;
    double radius = 10 + (Math.random() * 11);
    String fill = "blue";

    System.out.println("Enter Position x:");
    positionX = new Scanner(System.in).nextInt();
    System.out.println("Enter Position y:");
    positionY = new Scanner(System.in).nextInt();

    try (PrintWriter writer = new PrintWriter(fileName)) { // Try with resources to manage the file writer.
      writer.printf(Locale.ENGLISH,
        "<svg height=\"%d\" width=\"%d\">\n" + 
        "\t<circle cx=\"%d\" cy=\"%d\" r=\"%.2f\" fill=\"%s\"/>\n</svg>",
        height, width, positionX, positionY, radius, fill
      );
      System.out.println("SVG file created successfully: " + fileName);
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred while writing to the file.");
      e.printStackTrace();
    }
  }

}
