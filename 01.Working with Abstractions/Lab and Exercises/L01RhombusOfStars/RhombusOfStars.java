package L01;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        
        int n = readN(new Scanner(System.in));

        for (int i = 1; i <= n ; i++) {
            printRow(n, i);
        }
        for (int i = n-1; i >= 1 ; i--) {
            printRow(n, i);
        }
    }
    
    private static void printRow(int totalNumberOfStars, int starsToPrint) {
        int leadingSpaces = totalNumberOfStars - starsToPrint;

        for (int i = 0; i <leadingSpaces ; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i <starsToPrint ; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static int readN(Scanner scanner) {
        int n;
        return  n = Integer.parseInt(scanner.nextLine());
    }
}
