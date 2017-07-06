package com.bigdata.yahtzee.program;

import com.bigdata.yahtzee.commands.OnePairsCommand;
import com.bigdata.yahtzee.commands.SmallStraight;
import com.bigdata.yahtzee.commands.ThreeOfAKind;
import com.bigdata.yahtzee.commands.TwoPairsCommand;
import com.bigdata.yahtzee.commands.Yahtzee;
import com.bigdata.yahtzee.commands.YahtzeeCommandFactory;
import com.bigdata.yahtzee.helper.Dice;
import com.bigdata.yahtzee.helper.DisplayMenu;
import com.bigdata.yahtzee.helper.DisplayResult;
import java.util.Random;
import java.util.*;

/**
 *
 * @Developed by sushil jung kc
 *
 */
public class Main {

    public static int points;//points for the user for one chance
    public static int finalPoints; // total points of the user

    public static void main(String[] args) {

        int diceValues[] = new int[5];
        String rollAgain;
        int count = 1;
        Scanner reader = new Scanner(System.in);  // Reading from System.in

        System.out.println("----------------------BigData Yatzee Game--------------");
        do {
            points = 0;
            DisplayMenu.display();
//------------choice value form the user
            int n = reader.nextInt();
//------------dependency object creation
            Dice d1 = new Dice();
//------------Displaying the result of the players
            new DisplayResult().dispalyResult(diceValues, d1);
//------------displaying the value of Five Dice in Array Form By Sorting It
            Arrays.sort(diceValues);
            System.out.println(Arrays.toString(diceValues));
//------------evaluation of the user's choice for YahtzeeCatagory
            YahtzeeCommandFactory.getYahtzeeCatagoryCommand(n).check(diceValues);
            System.out.println("Want to roll again ? yes/no");
            rollAgain = reader.next();
            count = count + 1;
        } while (rollAgain.equals("yes") && count < 4);

        System.out.println("Your Total  Score Is::  " + Main.finalPoints);
    }

}
