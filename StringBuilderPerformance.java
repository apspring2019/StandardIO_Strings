public class StringBuilderPerformance
{
    private static final int REPEAT_COUNT = 10000;
    public static final String TO_BE_ADDED = "test";

    public static void main(String[] args)
    {
        System.out.println("Two Strings Concatenation:");
        //String plus operator test
        {
            long start = System.currentTimeMillis();
            String str = "";
            for (int i = 0; i < REPEAT_COUNT; i++)
                str += TO_BE_ADDED;
            System.out.println("String plus operator: " + (System.currentTimeMillis() - start));
        }
        //String concat test
        {
            long start = System.currentTimeMillis();
            String str = "";
            for (int i = 0; i < REPEAT_COUNT; i++)
                str = str.concat(TO_BE_ADDED);
            System.out.println("String concat: " + (System.currentTimeMillis() - start));
        }
        //StringBuilder test
        {
            long start = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < REPEAT_COUNT; i++)
                sb.append(TO_BE_ADDED);
            System.out.println("StringBuilder: " + (System.currentTimeMillis() - start));
        }

        System.out.println("Four Strings Concatenation:");
        //String plus operator test
        {
            long start = System.currentTimeMillis();
            String str = "";
            for (int i = 0; i < REPEAT_COUNT; i++)
                str += TO_BE_ADDED + TO_BE_ADDED + TO_BE_ADDED;
            System.out.println("String plus operator: " + (System.currentTimeMillis() - start));
        }
        //String concat test
        {
            long start = System.currentTimeMillis();
            String str = "";
            for (int i = 0; i < REPEAT_COUNT; i++)
                str = str.concat(TO_BE_ADDED).concat(TO_BE_ADDED).concat(TO_BE_ADDED);
            System.out.println("String concat: " + (System.currentTimeMillis() - start));
        }
        //StringBuilder test
        {
            long start = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < REPEAT_COUNT; i++)
                sb.append(TO_BE_ADDED).append(TO_BE_ADDED).append(TO_BE_ADDED);
            System.out.println("StringBuilder: " + (System.currentTimeMillis() - start));
        }

        System.out.println("Static Concatenation:");
        //String plus operator test
        {
            long start = System.currentTimeMillis();
            String str = "";
            for (int i = 0; i < REPEAT_COUNT * 20; i++)
                str = TO_BE_ADDED + TO_BE_ADDED + TO_BE_ADDED + TO_BE_ADDED;
            System.out.println("String plus operator: " + (System.currentTimeMillis() - start));
        }
        //String concat test
        {
            long start = System.currentTimeMillis();
            String str = "";
            for (int i = 0; i < REPEAT_COUNT * 20; i++)
                str = "".concat(TO_BE_ADDED).concat(TO_BE_ADDED).concat(TO_BE_ADDED).concat(TO_BE_ADDED);
            System.out.println("String concat: " + (System.currentTimeMillis() - start));
        }
    }
}
