package E03WildFarm;

public abstract class Food {
    private int quantity;

    protected Food(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

     public abstract String getType();

}
