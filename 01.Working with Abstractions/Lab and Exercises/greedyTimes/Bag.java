package greedyTimes;

public class Bag {
    private CashContainer cashContainer;
    private Gold gold;
    private GemContainer gemContainer;

    private long capacity;

    public Bag(long capacity){
        this.cashContainer = new CashContainer();
        this.gold = new Gold();
        this.gemContainer = new GemContainer();
        this.capacity = capacity;
    }

}
