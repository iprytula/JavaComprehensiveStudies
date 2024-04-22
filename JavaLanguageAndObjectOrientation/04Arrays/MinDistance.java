import java.awt.Point;
import java.util.Random;

public class MinDistance {

  private static Point[] points = { new Point(10, 20), new Point(12, 2), new Point(44, 4) };

  private static Point findNearest(Point[] points) {
    Random random = new Random();
    Point currentLocation = new Point(random.nextInt(40), random.nextInt(20));
    Point nearestPoint = new Point();
    double minDistance = -1;

    System.out.println("Current location: " + currentLocation.toString());
    
    for (Point point : points) {
      double distance = currentLocation.distance(point);

      if (minDistance < 0) {
        minDistance = distance;
        nearestPoint = point;

        continue;
      }

      if (distance < minDistance) {
        minDistance = distance;
        nearestPoint = point;
      }
    }

    return nearestPoint;
  }

  public static void main(String[] args) {
    System.out.println("Nearest point: " + findNearest(points).toString());
  }
}
