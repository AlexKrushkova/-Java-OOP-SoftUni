package E01CardSuit;

public class Main {
    public static void main(String[] args) {

        System.out.println("E03CardsWithPower.Card Suits:");

        CardSuit[] values = CardSuit.values();
        for (int i = 0; i <values.length ; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    values[i].ordinal(), values[i]);
        }
    }
}
