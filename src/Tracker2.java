/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */
import java.util.Scanner;

public class Tracker2 implements NumTrackerInterface
{
    public int countNums;
    public int calcSum;

    @Override
    public void add(int calcNum)
    {
        countNums = countNums + 1;
        calcSum = calcSum + calcNum;
    }

    @Override
    public int getSum()
    {
        return calcSum;
    }

    @Override
    public int getCount()
    {
        return countNums;
    }

    @Override
    public double getAverage()
    {
        Scanner scnr = new Scanner(System.in);
        String userEntry;
        double calcAverage;
        //user will pick if they want to calculate the average or not
        System.out.println("Would you like to calculate the average? (enter yes or press any key to quit)");
        userEntry = scnr.nextLine();

        if (userEntry.equals("yes") || userEntry.equals("y"))
        {

            calcAverage = calcSum * 1.0 / countNums;
            System.out.print("Average: ");
            return calcAverage;
        }
        else
        {
            System.out.print("Average not calculated. System exit as ");
            return 0;
        }
    }
}
