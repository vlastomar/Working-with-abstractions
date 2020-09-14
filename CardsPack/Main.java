package CardsPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String cards = Arrays.toString(FourSuis.values());
        cards = cards.replace("[", "");
        cards = cards.replace("]", "");
        String[] cardsGroup = cards.split(", ");

        System.out.println("Card Suits:");
        for (int i = 0; i < cardsGroup.length ; i++) {
            String temp = cardsGroup[i];
            System.out.println(String.format("Ordinal value: %d; Name value: %s", FourSuis.valueOf(temp).getValue(), FourSuis.valueOf(temp)));
        }


    }
}
