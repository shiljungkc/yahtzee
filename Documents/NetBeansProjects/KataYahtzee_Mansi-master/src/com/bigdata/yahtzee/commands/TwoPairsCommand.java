/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.yahtzee.commands;

import com.bigdata.yahtzee.program.Main;

/**
 *
 * @author User
 */
public class TwoPairsCommand extends CatagoryCommand {
    public int check(int[] diceValues) {
        
        
//==============If there are two pairs of dice with the same number, the player scores the sum of these dice===============


        int i = 0;
        int j = 1;
        int pair = 0;
        Main.points = 0;
        while (i < diceValues.length && j < diceValues.length) {
            if (diceValues[i] == diceValues[j]) { //if two consecutive elements have same value
                pair = pair + 1;
                Main.points = Main.points + diceValues[i] * 2; //add addition of the both values in the points for this round
                i = i + 2;//get the next to next index
                j = i + 1;
            } else {
                i = i + 1;
                j = i + 1;
            }
        }

        if (pair == 2) {//check if there are 2 pairs
            System.out.println("Congratulations..You won Two Pairs");
            System.out.println("Your points:" + Main.points);
        } else {
            System.out.println("Oops...No score!");
            Main.points = 0;
            System.out.println("Your points:" + Main.points);
        }
        Main.finalPoints = Main.finalPoints + Main.points;
        return Main.points;
    }

    
}
