package CardsPack;

public enum FourSuis {
    CLUBS(0), DIAMONDS(1), HEARTS(2), SPADES(3);

   private int value;

   FourSuis(int value){
       this.value = value;
   }

    public int getValue() {
        return this.value;
    }
}
