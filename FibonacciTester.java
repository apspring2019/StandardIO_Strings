import java.util.Scanner;

public class FibonacciTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int faultCount = 0;
        int currentNum = 1;
        int previousNum = 1;

        inputLoop:
        while (scanner.hasNext())
        {
            while (!scanner.hasNextInt())   //Skipping any token which is not a number
                scanner.next();
            int nextNum = currentNum + previousNum;
            while (scanner.nextInt() != nextNum)
            {
                faultCount++;
                System.out.println("Please try again!");
                if (faultCount > 3)
                {
                    System.out.println("You lose!");
                    break inputLoop;
                }
            }
            faultCount = 0;
            previousNum = currentNum;
            currentNum = nextNum;
        }
    }
}
