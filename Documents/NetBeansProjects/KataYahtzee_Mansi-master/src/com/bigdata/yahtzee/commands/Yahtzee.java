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
public class Yahtzee extends CatagoryCommand {
    
     public int check(int[] diceValues) {
         
//=====================If all dice are the have the same number, the player scores 50 points, otherwise 0.
    
        Main.points = 0;

        if (diceValues[0] == diceValues[1] && diceValues[1] == diceValues[2] && diceValues[2] == diceValues[3] && diceValues[3] == diceValues[4]) { //if two consecutive elements are consecutive numbers
            Main.points = 50;
        } else {
            Main.points = 0;
        }

        if (Main.points == 50) { //check if the numbers' total is 15
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
