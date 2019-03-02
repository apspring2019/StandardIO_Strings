import java.util.Scanner;

public class DurationCalculator
{
    private static final int MINUTES_IN_HOUR = 60;
    private static final int HOURS_IN_DAY = 24;

    //A simple program with a naive way of parsing hh:mm -> hh:mm and giving the duration in return
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String inputLine;
        while (scanner.hasNextLine() &&
                !(inputLine = scanner.nextLine()).equalsIgnoreCase("end"))
        {
            int pointerPosition = inputLine.indexOf("->");
            String start = inputLine.substring(0, pointerPosition);
            String end = inputLine.substring(pointerPosition + 2);
            int totalMinutes = calcDuration(start.trim(), end.trim());
            System.err.println("Total minutes: " + totalMinutes);
            System.out.printf("%d:%d\n", totalMinutes / MINUTES_IN_HOUR, totalMinutes % MINUTES_IN_HOUR);
        }
    }

    private static int calcDuration(String start, String end)
    {
        int duration = calcTotalMinutes(end) - calcTotalMinutes(start);
        if (duration < 0)   //If duration is negative, the end is in the next day
            duration += HOURS_IN_DAY * MINUTES_IN_HOUR;
        return duration;
    }

    private static int calcTotalMinutes(String time)
    {
        int colonPosition = time.indexOf(':');
        String hour = time.substring(0, colonPosition);
        String min = time.substring(colonPosition + 1);

        return Integer.parseInt(hour) * MINUTES_IN_HOUR + Integer.parseInt(min);
    }
}
