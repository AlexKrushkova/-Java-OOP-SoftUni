package LastLesonLab6;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int priceMultiplier;

    Season(int priceMultiplier){
        this.priceMultiplier=priceMultiplier;
    }
    public double multipliedPrice(double price){
        return price*this.priceMultiplier;
    }
}
