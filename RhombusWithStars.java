import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RhombusWithStars {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(read.readLine());

        for (int row = 1; row <= number ; row++) {
            int upperHalfMax = number - row;
            int lowerHalfMax = row;
            printRhombus(number, row, upperHalfMax, lowerHalfMax);
        }

        for (int row = 1; row <= number -1 ; row++) {
            int upperHalfMax = row;
            int lowerHalfMax = number - row;
            printRhombus(number, row, upperHalfMax, lowerHalfMax);

        }
    }
    public static void printRhombus(int number, int row, int upperHalfMax, int lowerHalfMax){
        for (int space = 1; space <= upperHalfMax ; space++) {
            System.out.print(" ");
        }
        for (int star = 0 ; star < lowerHalfMax ; star++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}
