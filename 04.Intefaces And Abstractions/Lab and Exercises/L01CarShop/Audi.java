package L01CarShop;

public class Audi extends CarImpl implements Rentable {

    private Integer minRentDays;
    private Double pricePerDay;

    public Audi(String model, String color, int horsePower, String countryProduced,
                Integer minRentDays, Double pricePerDay){
        super(model,color,horsePower,countryProduced);
        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
    }


    @Override
    public Integer getMinRentDay() {
        return this.minRentDays;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("Minimum rental period of %d. Price per %f",
                this.getMinRentDay(),this.getPricePerDay());
    }
}
