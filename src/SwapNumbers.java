import java.util.Scanner;

public class SwapNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2, temp;

        System.out.print("Enter first number : ");
        num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        num2 = sc.nextInt();
        System.out.println("Before Swapping : 1st Number = " + num1 + ", 2nd Number = " + num2 );

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping : 1st Number = " + num1 + ", 2nd Number = " + num2 );
    }
}
