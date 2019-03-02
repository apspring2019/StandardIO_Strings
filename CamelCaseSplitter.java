import java.util.Scanner;

public class CamelCaseSplitter
{
    //Simply splits the camelCase string. Example:
    //previousIndex => previous, Index
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your camel case statement:");
        String statement = scanner.nextLine();
        int previousIndex = 0;
        for (int i = 0; i < statement.length(); i++)
            if (Character.isUpperCase(statement.charAt(i)))
            {
                System.out.println(statement.substring(previousIndex, i).toLowerCase());
                previousIndex = i;
            }

        System.out.println(statement.substring(previousIndex).toLowerCase()); //Last part
    }
}
