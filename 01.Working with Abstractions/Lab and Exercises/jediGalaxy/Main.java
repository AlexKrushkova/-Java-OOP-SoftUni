package jediGalaxy;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPosition(scanner.nextLine());

        Galaxy galaxy = new Galaxy(new Field(dimensions[0], dimensions[1]));


        String positions = scanner.nextLine();
        long starPowerCollected = 0;

        while (!positions.equals("Let the Force be with you")) {
            int[] jediPositions = readPosition(positions);
            int[] sithPosition = readPosition(scanner.nextLine());


            int rowJedi = jediPositions[0];
            int colJedi = jediPositions[1];

            int rowSith = sithPosition[0];
            int colSith = sithPosition[1];

            galaxy.moveSith(rowSith,colSith);
            starPowerCollected += galaxy.moveJedi(rowJedi,colJedi);


            positions = scanner.nextLine();
        }


        System.out.println(starPowerCollected);
    }

    private static int[] readPosition(String positions) {
        return Arrays.stream(positions
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
