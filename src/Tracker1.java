//first implementation of interface NumTrackerInterface
public class Tracker1 implements NumTrackerInterface
{
    public int countNums;
    public int calcSum;
    public double calcAverage;

    @Override
    public void add(int calcNum)
    {
        countNums = countNums + 1;
        calcSum = calcSum + calcNum;
        calcAverage = calcSum * 1.0 / countNums;
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
        return calcAverage;
    }
}
