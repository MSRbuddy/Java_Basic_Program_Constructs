import java.util.Scanner;


public class HarmonicNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        if (N == 0) {
            System.out.println("Invalid input. N should be a non-zero value.");
            return;
        }

        double harmonicNumber = 0.0;

        for (int i = 1; i <= N; i++) {
            harmonicNumber += (1.0 / i);

            System.out.println("The " + i + " th Harmonic Number is: " + harmonicNumber);
        }

    }
}
