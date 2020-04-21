package L04HotelReservation;

public enum DiscountType {

    VIP(0.20),
    SECOND_VISIT(0.10),
    NONE(0.0);

    private double discount;

    DiscountType(double discount) {
        this.discount = discount;
    }

    public double discountFor(double amount){
        double discount = amount * this.discount;
        return amount - discount;
    }
}
