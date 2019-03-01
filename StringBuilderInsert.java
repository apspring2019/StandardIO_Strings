import java.util.Scanner;

public class StringBuilderInsert
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("The fox jumps over the dog.");
        System.out.println("Enter an adjective for the fox");
        int foxIndex = sb.indexOf("fox");
        sb.insert(foxIndex, scanner.nextLine().trim() + " ");

        System.out.println("Enter an adjective for the dog");
        int dogIndex = sb.indexOf("dog");
        sb.insert(dogIndex, scanner.nextLine().trim() + " ");
        
        System.out.println(sb);
    }
}
