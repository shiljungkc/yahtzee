/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.yahtzee.commands;

/**
 *
 * @author User
 */
public class YahtzeeCommandFactory {
    public static CatagoryCommand getYahtzeeCatagoryCommand(Integer n)
    {
         switch (n) {
                case 1:

                   return new OnePairsCommand();
                    
                case 2:

                    return new TwoPairsCommand();
                    
                case 3:

                    return new ThreeOfAKind();
                   
                case 4:

                    return new SmallStraight();
                    
                case 5:

                    return new Yahtzee();
                    
                default:
                    return null;

            }
    }
    
}
