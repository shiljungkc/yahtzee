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
public class ThreeOfAKind extends CatagoryCommand{
    
      public int check(int[] diceValues) {
          
//============================If there are three dice with the same number, the player scores the sum of these dice.================================

        int i = 0;
        int j = 1;

        while (i < diceValues.length && j < diceValues.length) {
            if (diceValues[i] == diceValues[j]) {//if two consecutive elements have same value
                if (i + 1 < diceValues.length && j + 1 < diceValues.length && diceValues[i + 1] == diceValues[j + 1]) {
                    Main.points = diceValues[i] * 3;
                    i = i + 2;//get the next to next index
                    j = i + 1;
                } else {
                    i = i + 1;
                    j = i + 1;
                }
            } else {
                i = i + 1;
                j = i + 1;
            }
        }

        if (Main.points > 0) {//check if there are some points achieved
            System.out.println("Congratulations..You won Three of a kind");
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
