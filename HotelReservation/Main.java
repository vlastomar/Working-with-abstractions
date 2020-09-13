package HotelReservation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));


        String[] input = read.readLine().split("\\s+");
        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        String sea = input[2];
        String discountType = input[3];
        DiscountType discType = DiscountType.valueOf(discountType.toUpperCase());
        Season season = Season.valueOf(sea.toUpperCase());


       System.out.println(String.format("%.2f", PriceCalculator.calculateTotalPriceHoliday(pricePerDay, numberOfDays, discType, season)) );


    }
}
