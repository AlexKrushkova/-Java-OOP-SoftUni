package LastLesonLab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        InputDataReservation parser = new InputDataReservation();
        Reservation reservation = parser.parseFromLine(line);

        double price = reservation.calculatePrice();

        Printer printer = new Printer(System.out);
        printer.printDoubleRounded(price);
    }
}
