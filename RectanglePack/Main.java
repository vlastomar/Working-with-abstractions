package RectanglePack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] inputRectngleCoordinates = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int x1 = inputRectngleCoordinates[0];
        int y1 = inputRectngleCoordinates[1];
        int x2 = inputRectngleCoordinates[2];
        int y2 = inputRectngleCoordinates[3];
        Point coordinatesFirstPoint = new Point(x1, y1);
        Point coordinatesSecondPoint = new Point(x2, y2);

        Rectangle coordinatesRectangle = new Rectangle(coordinatesFirstPoint, coordinatesSecondPoint);

        int number = Integer.parseInt(read.readLine());

        for (int i = 0; i < number ; i++) {
            int[] coordinatesPoint = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            x1 = coordinatesPoint[0];
            y1 = coordinatesPoint[1];
            Point coordinatesOnePoint = new Point(x1, y1);
            System.out.println(Rectangle.contains(coordinatesOnePoint, coordinatesRectangle));

        }

    }
}
