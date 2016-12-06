/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racingweek14;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author uyen
 */
import java.util.ArrayList;

import java.util.Scanner;

import java.util.InputMismatchException;

public class RacingWeek14
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberOfDice=0;
        Truck_SubClass Truck = new Truck_SubClass(2000,"Ford","F150","Big Truck",3);
        Van_SubClass Van = new Van_SubClass(2010,"Dodge","Ram","R1500",4);
        Sport_SubClass Sportcar = new Sport_SubClass(1990,"Chevy","Impala","Deer",6);
        try{
            System.out.println("Enter the number of dices to throw:");
            numberOfDice=input.nextInt();
        }
        catch(InputMismatchException inputMismatchException)
        {
            System.err.printf("\nException: %s\n",inputMismatchException);
            System.out.println("You cannot enter a leter. Please try again.");
        }
        int RaceCycles=Dice.Throw(numberOfDice);
        System.out.printf("Race Cycles %d",RaceCycles);
        String RaceStatus = "";
        for(int cycle=1; cycle<=RaceCycles;cycle++)
        {
            Truck.SetCycle(cycle);
            Van.SetCycle(cycle);
            Sportcar.SetCycle(cycle);
            Truck.setSound();
            Van.setSound();
            Sportcar.setSound();
            if(RaceCycles-cycle==1)
                System.out.println("Race in Yellow flag!");
            System.out.println(Truck.toString() + "\n" + Van.toString() + "\n" + Sportcar.toString());
            System.out.println("Race Cycle:" + Integer.toString(cycle));
            System.out.println(RaceStatus);
        }
        RaceStatus = Truck.GetName() + ": Distance Travel= " + Truck.GetDistance() + "\t";
        RaceStatus = Van.GetName() + ": Distance Travel= " + Van.GetDistance() + "\t";
        RaceStatus = Sportcar.GetName() + ": Distance Travel= " + Sportcar.GetDistance() + "\t";
        System.out.println("Race Result");
        System.out.println(RaceStatus);
        System.out.println("Goodbye!");
    }
}