package LastLesonLab6;

public class Reservation {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private DiscountType discountType;

    public Reservation(
        double pricePerDay,
        int numberOfDays,
        Season season,
        DiscountType discountType)
    {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculatePrice(){
        double basePrice = pricePerDay*numberOfDays;
        basePrice = season.multipliedPrice(basePrice);
        basePrice = discountType.discountPrice(basePrice);

        return basePrice;
    }

}
