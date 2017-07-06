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
public class OnePairsCommand extends CatagoryCommand {
    
//==========================the sum of the two highest matching dice.=============================
    
    public int check(int[] diceValues) {
        int i = 0;
        int j = 1;
        int pair = 0;
        while (i < diceValues.length && j < diceValues.length) {
            if (diceValues[i] == diceValues[j]) {//if two consecutive elements have same value
                pair = pair + 1;
                Main.points = diceValues[i] * 2;
                i = i + 2;//get the next to next index
                j = i + 1;
            } else {
                i = i + 1;
                j = i + 1;
            }
        }

        if (Main.points > 0) {
            System.out.println("Congratulations..You won In One Pairs Category");
            System.out.println("Your Total Points:" +Main.points);
        } else {
            System.out.println("No score!   You are A looser");
            Main.points = 0;
            System.out.println("Your Total Points:" + Main.points);
        }
        Main.finalPoints = Main.finalPoints + Main.points;
        return Main.points;
    }
    
}
