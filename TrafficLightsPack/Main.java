package TrafficLightsPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

         TrafficLights[] lights = Arrays
                 .stream(read.readLine().split("\\s+"))
                 .map(TrafficLights::valueOf)
                 .toArray(TrafficLights[]::new);
        int number = Integer.parseInt(read.readLine());
        //TrafficLights.changePositionOfLights(trafficLights, number);

        TrafficLights[] trafficLights1 = TrafficLights.values();
        for (int i = 0; i < number ; i++) {
            for (int j = 0; j < lights.length ; j++) {
            TrafficLights light = lights[j];
            int nextIndex = light.ordinal() + 1;
            TrafficLights value = trafficLights1[nextIndex % trafficLights1.length];
            lights[j] = value;
                System.out.print(value + " ");

            }
            System.out.println();
        }
    }
}
