package CardsPowerPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String rank = read.readLine();
        String suit = read.readLine();

        System.out.println(String.format("Card name: %s of %s; Card power: %d", rank, suit, Cards.calculatePowerOfCard(rank, suit)));



    }
}
