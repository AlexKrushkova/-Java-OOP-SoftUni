package E01Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Car car = new Car(Double.parseDouble(input[1]),Double.parseDouble(input[2]));

        input = scanner.nextLine().split("\\s+");

        Truck truck = new Truck(Double.parseDouble(input[1]),Double.parseDouble(input[2]));

        int n = Integer.parseInt(scanner.nextLine());

        while(n-->0){
            String [] tokens = scanner.nextLine().split("\\s+");

            if (tokens[0].equals("Drive")){
                System.out.println(driveCorrectVehicle(tokens[1], car, truck, Double.parseDouble(tokens[2])));
            }
            else {
                refuelCorrectVehicle(tokens[1], car, truck, Double.parseDouble(tokens[2]));
            }
        }
        System.out.println(car.toString());
        System.out.println(truck.toString());
    }

    private static void refuelCorrectVehicle(String type, Car car, Truck truck, double quantity) {
        if (type.equals("Car")) {
            car.refuel(quantity);
        } else {
            truck.refuel(quantity);
        }
    }

    private static String driveCorrectVehicle(String type, Vehicle car, Vehicle truck, Double distance) {
        if (type.equals("Car")) {
           return car.drive(distance);
        }
           return truck.drive(distance);
    }
}
