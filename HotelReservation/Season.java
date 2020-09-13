package HotelReservation;

public enum Season {
    AUTUMN(1), SPRING(2), WINTER(3), SUMMER(4);

    private int value;

    Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
