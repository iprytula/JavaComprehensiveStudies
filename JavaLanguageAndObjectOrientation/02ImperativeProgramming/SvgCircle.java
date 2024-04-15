import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class SvgCircle {

  public static void main(String[] args) {
    String fileName = "circle.svg";
    int height = 0;
    int width = 0;
    int positionX = 0;
    int positionY = 0;
    double radius = 10 + (Math.random() * 11);
    String color = "";

    System.out.println("Choose color:");
    color = new Scanner(System.in).nextLine();
    System.out.println("Enter width:"); 
    width = new Scanner(System.in).nextInt();
    System.out.println("Enter height:");
    height = new Scanner(System.in).nextInt();
    System.out.println("Enter Position x:");
    positionX = new Scanner(System.in).nextInt();
    System.out.println("Enter Position y:");
    positionY = new Scanner(System.in).nextInt();

    try (PrintWriter writer = new PrintWriter(fileName)) {
      writer.printf(Locale.ENGLISH,
        "<svg height=\"%d\" width=\"%d\">\n" + 
        "\t<circle cx=\"%d\" cy=\"%d\" r=\"%.2f\" fill=\"%s\"/>\n</svg>",
        height, width, positionX, positionY, radius, color
      );
      System.out.println("SVG file created successfully: " + fileName);
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred while writing to the file.");
      e.printStackTrace();
    }
  }

}
