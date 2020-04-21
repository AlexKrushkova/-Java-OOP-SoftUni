package LastLesonLab6;

public enum DiscountType {
    VIP(0.2),
    SECONDVISIT(0.1),
    NONE(0.0);

    private double priceDiscount;

    DiscountType(double priceDiscount){
        this.priceDiscount=priceDiscount;
    }
    public double discountPrice (double price){
        double discount = price * this.priceDiscount;
        return price-discount;
    }
}
