/* Problem Set 2 - 11 - a, b and c
-------------------------------------------------------------*
/*
Name: Patricia Antlitz
Date: 09/17/2022
Class: CIS-252 Computer Science II - NECC Fall 2022

 * Please read the README file for detailed information about this program.

 * This file is the main class that runs the program
 * objects are created from classes the implement an interface class
 * The first implement class, Tracker1 calculated the sum and average of a set of numbers, and gives the count
 * Tracker2 has the same calculation, however, it will only calculate the average if necessary (requested)
 */
/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */

//main class, will run the program
public class NumTrackerInterface_PatriciaAntlitz
{
    public static void main(String[] args)
    {
        //objects were created from both of the implementation classes
        //we want to test both
        NumTrackerInterface oneTrack = new Tracker1();
        NumTrackerInterface track2 = new Tracker2();

        oneTrack.add(5);
        oneTrack.add(15);
        oneTrack.add(9);

        System.out.println(oneTrack.getCount() + " Numbers Calculated.");
        System.out.println("Sum total = " + oneTrack.getSum());
        System.out.print("Average = ");
        System.out.format("%.2f", oneTrack.getAverage());
        System.out.println("\n");

        track2.add(8);
        track2.add(15);
        track2.add(12);
        track2.add(7);

        System.out.println(track2.getCount() + " Numbers Calculated");
        System.out.println("Sum total = " + track2.getSum() + "\n");
        //this call will trigger user input from Tracker2.java
        System.out.format("%.2f", track2.getAverage());
        System.out.println("");
    }
}
