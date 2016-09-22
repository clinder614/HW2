/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw2;

/**
 *
 * @author courtneylinder, kierstynbrandt
 */
public class Bubble implements MathBehavior {
 
     public int[] mathSort(int[] num){
         
        int size=num.length; 
        
        for (int i=0; i<size; i++) {
            boolean swapCheck = false;
            
            for(int j=0; j<size; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                    swapCheck=true;
                }
            }
            if(!swapCheck){
                break;
            }
        }
        
        return num;
     }
}
