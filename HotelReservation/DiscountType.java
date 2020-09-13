package HotelReservation;

public enum DiscountType {
    VIP(0.80), SECONDVISIT(0.90), NONE(1.0);

    private double value;

    DiscountType(double value){
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
