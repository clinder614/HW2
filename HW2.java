/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.Scanner;

/**
 *
 * @author courtneylinder
 */
public class HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner( System.in );
        int input;
        MathProgram mp;
        boolean okay = false;
        while(!okay){
            System.out.println("What math program would you like to use?");
            System.out.println("Press 1 for MyMath, 2 for MTool, and 3 for Mathmatica.");
            input = userInput.nextInt();
            if(input == 1){
                mp = new MyMath();
                okay = true;
            }
            else if(input == 2){
                mp = new MTool();
                okay = true;
            }
            else if(input == 3){
                mp = new Mathematica();
                okay = true;
            }
            else{
                System.out.println("You do not enter a valid choice. Please try again.");
            }
        
        }
        
    }
    
}
