import java.util.Scanner;

public class PrimeFactors
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = scanner.nextInt();

        System.out.print("Prime factors of " + N + ": ");
        computePrimeFactors(N);
    }

    public static void computePrimeFactors(int num)
    {
        for (int i = 2; i * i <= num; i++)
        {
            while (num % i == 0)
            {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num > 1)
        {
            System.out.print(num);
        }
    }
}