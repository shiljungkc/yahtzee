/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.yahtzee.helper;

/**
 *
 * @author User
 */
public class DisplayResult {
    public void dispalyResult(int[] diceValues,Dice d1)
    {
         System.out.println("=============================");
            System.out.println("       result       ");
            System.out.println("--------------------");
            for (int i = 0; i < 5; i++) {
                diceValues[i] = d1.rollDice(d1.getValues());
                
                System.out.println(diceValues[i]);
            }
    }
    
}
