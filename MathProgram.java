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
public class MathProgram {
    MathBehavior b;
    int[] array = new int[10]; 
    
    public MathProgram(){
       for(int i = 0; i < 10; i++){
            array[i] = (int) (Math.random() * 20);
        }    
    }
    
    public void performSort(){
        b.mathSort(array);
    }
    
    public void setMathBehavior(MathBehavior b){
        this.b = b;
    }
    
}
