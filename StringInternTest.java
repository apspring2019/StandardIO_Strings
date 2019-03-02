public class StringInternTest
{
    public static void main(String[] args)
    {
        String s1 = "Salam";
        String s2 = "Salam";
        String s3 = "Salam".intern();
        String s4 = new String("Salam");
        String s5 = new String("Salam").intern();

        if (s1 == s2)
            System.out.println("s1 and s2 are same");

        if (s1 == s3)
            System.out.println("s1 and s3 are same");

        if (s1 == s4)
            System.out.println("s1 and s4 are same");

        if (s1 == s5)
            System.out.println("s1 and s5 are same");
    }
}
