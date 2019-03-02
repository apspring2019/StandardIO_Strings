import java.util.Scanner;

public class FibonacciTester
{
    //Simply asks user to input the fibonacci series
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Initialization
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
                if (faultCount > 3)
                {
                    System.out.println("You lose!");
                    break inputLoop;
                }
                System.out.println("Please try again!");
            }
            faultCount = 0;
            previousNum = currentNum;
            currentNum = nextNum;
        }
    }
}
