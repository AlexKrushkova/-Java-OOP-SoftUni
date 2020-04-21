package L01CarShop;

public interface Car {
    public static final int TIRES = 4;

    public abstract String getModel();
    public abstract String getColor();
    public abstract Integer getHorsePower();
    public abstract String countryProduced();
}
