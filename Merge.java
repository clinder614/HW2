/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import static java.lang.Math.E;
import java.util.Arrays;

/**
 *
 * @author courtneylinder, kierstyn brandt
 */
public class Merge implements MathBehavior{
    
    public int[] mathSort(int[] array){
        if (array.length >= 2) {
            //divide
            int mid = array.length / 2;
            int[] a1 = Arrays.copyOfRange(array, 0, mid);
            int[] a2 = Arrays.copyOfRange(array, mid, array.length);

            //"conquer"
            mathSort(a1);
            mathSort(a2);

            //merge
            merge(a1, a2, array);
        }
        return array;
    }

    public void merge(int[] a1, int[] a2, int[] array) {
        int i = 0;
        int j = 0;

        while (i + j < array.length) {
            if (i == a1.length) {
                array[i + j] = a2[j];
                j++;
            } else if (j == a2.length) {
                array[i + j] = a1[i];
                i++;
            } else if (a1[i] <= (a2[j])) {
                array[i + j] = a1[i];
                i++;
            } else {
                array[i + j] = a2[j];
                j++;
            }
        }
    }
 }
