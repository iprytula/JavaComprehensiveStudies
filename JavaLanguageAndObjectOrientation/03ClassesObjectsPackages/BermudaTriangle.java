import java.awt.Point;
import java.awt.Polygon;
import java.util.Random;

class BermudaTriangle {
  final static int DIMENSION = 50;
  final static String BORDER = "+";
  final static String FOG = "=";
  final static String OCTOPUS = "&";

  public static void main(String[] args) {
    Polygon bermuda = new Polygon();
    Point ship = new Point(25, 25);

    // Dimensions of the Bermuda triangle
    bermuda.addPoint(10, 40);
    bermuda.addPoint(20, 5);
    bermuda.addPoint(40, 20);

    // Inside the Bermuda triangle?
    System.out.println(bermuda.contains(ship));

    // bermuda = createRandomTriangle();

    // For every coordinate pair test if inside triangle
    for (int y = 0; y < DIMENSION; y++) {
      for (int x = 0; x < DIMENSION; x++) {
        // test for border
        if (x == 0 || y == 0 || x == DIMENSION - 1 || y == DIMENSION - 1)
          System.out.print(BORDER);
        else
          System.out.print(bermuda.contains(x, y) ? OCTOPUS : FOG);
      }
      System.out.println();
    }
  }

  static Polygon resetWithRandomTriangle(Polygon polygon) {
    Random random = new Random();
    Point point1 = new Point(random.nextInt(DIMENSION), random.nextInt(DIMENSION));
    Point point2 = new Point(random.nextInt(DIMENSION), random.nextInt(DIMENSION));
    Point point3 = new Point(random.nextInt(DIMENSION), random.nextInt(DIMENSION));

    polygon.addPoint((int) point1.getX(), (int) point1.getY());
    polygon.addPoint((int) point2.getX(), (int) point2.getY());
    polygon.addPoint((int) point3.getX(), (int) point3.getY());

    return polygon;
  }

  static Polygon createRandomTriangle() {
    Random random = new Random();
    Point point1 = new Point(random.nextInt(DIMENSION), random.nextInt(DIMENSION));
    Point point2 = new Point(random.nextInt(DIMENSION), random.nextInt(DIMENSION));
    Point point3 = new Point(random.nextInt(DIMENSION), random.nextInt(DIMENSION));

    Polygon polygon = new Polygon();
    polygon.addPoint((int) point1.getX(), (int) point1.getY());
    polygon.addPoint((int) point2.getX(), (int) point2.getY());
    polygon.addPoint((int) point3.getX(), (int) point3.getY());

    return polygon;
  }

}