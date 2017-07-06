/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.yahtzee.helper;

import java.util.Random;

/**
 *
 * @author User
 */
public class Dice {
    private int[] values = {1, 2, 3, 4, 5, 6};
    private int score = rollDice(values);//value of the dice

    //function to get value for the dice after rolling the dice
    public  int rollDice(int[] array) {
        int rnd = new Random().nextInt(values.length-1);
        // function to generate randam value
        return array[rnd];
    }

    public int getScore() {
        return score;
    }

    public int[] getValues() {
        return values;
    }
    
}
