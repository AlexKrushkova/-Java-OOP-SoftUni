package E02CardRank;
public class Main {
    public static void main(String[] args) {

        System.out.println("E03CardsWithPower.Card Ranks:");

        CardRank[] values = CardRank.values();
        for (int i = 0; i <values.length ; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    values[i].ordinal(), values[i]);
        }
    }
}
