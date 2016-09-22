/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 *
 * @author courtneylinder, kierstyn brandt
 */
public class Mathematica extends MathProgram{
    public Mathematica(){
        b = new Insertion();
        
    }
    public void performSort(){
        System.out.println("Unsorted Array");
        for(int i = 0; i < 10; i++){
            System.out.print(array[i] + " ");
        }
        b.mathSort(array);
        System.out.println("\nSorted Array");
        for(int i = 0; i < 10; i++){
            System.out.print(array[i] + " ");
        }
    }
    
}
