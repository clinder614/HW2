/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.Scanner;

/**
 *
 * @author courtneylinder. kierstyn brandt
 */
public class HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner( System.in );
        int input;
        String answer;
        int answer2;
        MathProgram mp;
        boolean okay = false;
        while(!okay){
            System.out.println("What math program would you like to use?");
            System.out.println("Press 1 for MyMath, 2 for MTool, and 3 for Mathmatica.");
            input = userInput.nextInt();
            if(input == 1){
                mp = new MyMath();
                mp.performSort();
                okay = true;
            }
            else if(input == 2){
                mp = new MTool();
                mp.performSort();
                okay = true;
            }
            else if(input == 3){
                mp = new Mathematica();
                mp.performSort();
                okay = true;
            }
            else{
                System.out.println("You do not enter a valid choice. Please try again.\n");
            }
        
        }
        
    }
    
}
