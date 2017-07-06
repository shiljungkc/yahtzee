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
public class SmallStraight extends CatagoryCommand {
     public int check(int[] diceValues) {
         
//=========================If the dice read 1,2,3,4,5, the player scores 15 (the sum of all the dice), otherwise 0.
        int i = 0;
        int j = 1;
        Main.points = 0;
        while (j < diceValues.length) {
            if (diceValues[i] == diceValues[j] - 1) { //if two consecutive elements are consecutive numbers
                Main.points = Main.points + diceValues[i];
                i = i + 1;
                j = j + 1;
                if (j == 4) {
                    Main.points = Main.points + diceValues[j];
                }
            } else {
                Main.points = 0;
            }
        }

        if (Main.points == 15) { //checking total is 15 or not of a numbers
            System.out.println("Congratulations..You won Small Straight");
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
