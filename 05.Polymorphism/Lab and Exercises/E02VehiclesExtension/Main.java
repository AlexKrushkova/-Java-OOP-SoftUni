package E02VehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehicleByType = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\s+");
        vehicleByType.put("Car", new Car(Double.parseDouble(input[1]),
                Double.parseDouble(input[2]),
                Integer.parseInt(input[3])));

        input = scanner.nextLine().split("\\s+");
        vehicleByType.put("Truck", new Truck(Double.parseDouble(input[1]),
                Double.parseDouble(input[2]),
                Integer.parseInt(input[3])));

        input = scanner.nextLine().split("\\s+");
        vehicleByType.put("Bus", new Bus(Double.parseDouble(input[1]),
                Double.parseDouble(input[2]),
                Integer.parseInt(input[3])));

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String type = tokens[1];
            double param = Double.parseDouble(tokens[2]);

            String command = tokens[0];
            if (command.equals("Drive") && type.equals("Bus")) {
                System.out.println(((Bus) vehicleByType.get("Bus")).driveWithPassengers(param));
            } else if (command.contains("Drive")) {
                System.out.println(vehicleByType.get(type).drive(param));
            } else if (command.equals("Refuel")) {
                try {
                    vehicleByType.get(type).refuel(param);
                } catch (IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }

        for (Vehicle vehicle : vehicleByType.values()) {
            System.out.println(vehicle.toString());
        }
    }
}
