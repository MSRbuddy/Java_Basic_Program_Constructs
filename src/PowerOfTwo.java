import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the power value: ");
        int N = scanner.nextInt();

        int power = 1;
        for (int i = 1; i <= N; i++)
        {
            power = power * 2;
        }
        System.out.println("Power of 2 with power " + N + " is : " + power);
    }
}
