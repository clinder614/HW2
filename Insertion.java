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
public class Insertion implements MathBehavior {

    public void mathSort(int[] num){
     int n = num.length;
       
       for(int k =1; k<n; k++){
           int cur = num[k];
           int j = k;
       
       
       while(j>0 && num[j-1]>cur){
           num[j]=num[j-1];
           j--;
       }
       num[j]=cur;
       }
   }
}
