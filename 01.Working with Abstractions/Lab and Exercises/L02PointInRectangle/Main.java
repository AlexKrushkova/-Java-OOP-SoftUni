package L02PointInRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottomLeftX = scanner.nextInt();
        int bottomLeftY = scanner.nextInt();
        int topRightX = scanner.nextInt();
        int topRightY = scanner.nextInt();

        int numberOfPoints = scanner.nextInt();

        Rectangle rectangle = new Rectangle(
                new Point(bottomLeftX,bottomLeftY),
                new Point(topRightX,topRightY)
        );

        for (int i = 0; i <numberOfPoints ; i++) {
            int pointX = scanner.nextInt();
            int pointY = scanner.nextInt();
            Point point =  new Point(pointX,pointY);
            System.out.println(rectangle.contains(point));
        }
    }
}
