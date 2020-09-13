package HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;
    private DiscountType type;
    private Season vlado;

    public PriceCalculator(double pricePerDay, int numberOfDays, DiscountType type, Season season) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.type = type;
        this.vlado = season;
    }

    public static double calculateTotalPriceHoliday(double pricePerDay, int numberOfDays, DiscountType type, Season vlado){
        double pctDiscount = type.getValue();
        int vl = vlado.getValue();
        double result =  pricePerDay * numberOfDays * pctDiscount * vl * 1.0;
        return result;
}
}
