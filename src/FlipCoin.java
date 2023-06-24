import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();

        if (numFlips <= 0) {
            System.out.println("Number of flips should be a positive integer.");
            return;
        }

        int numHeads = 0;
        int numTails = 0;
        Random random = new Random();

        for (int i = 0; i < numFlips; i++) {
            double flipResult = random.nextDouble(); // Random value between 0 and 1

            if (flipResult < 0.5) {
                numTails++;
            } else {
                numHeads++;
            }
        }

        double headPercentage = (double) numHeads / numFlips * 100;
        double tailPercentage = (double) numTails / numFlips * 100;

        System.out.println("Number of Heads: " + numHeads);
        System.out.println("Number of Tails: " + numTails);
        System.out.println("Percentage of Heads: " + headPercentage + "%");
        System.out.println("Percentage of Tails: " + tailPercentage + "%");
    }
}
