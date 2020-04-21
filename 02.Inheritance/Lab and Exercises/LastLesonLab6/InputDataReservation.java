package LastLesonLab6;

import LastLesonLab6.DiscountType;
import LastLesonLab6.Reservation;
import LastLesonLab6.Season;


public class InputDataReservation {

    public Reservation parseFromLine (String line){
        String[] split = line.split("\\s+");

        double pricePerDay = Double.parseDouble(split[0]);
        int numberOfDays = Integer.parseInt(split[1]);
        Season season = Season.valueOf(split[2].toUpperCase());
        DiscountType discountType = DiscountType.valueOf(split[3].toUpperCase());

        return new Reservation(pricePerDay, numberOfDays,season, discountType);
    }
}
