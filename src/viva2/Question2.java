/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        
    
        double arr1 [] = {5.2, 2.1, 17.2};
        double arr2 [] = {1.3, 2.4, 2.1, 11.1};
        
        double [] unsortedArray = merge(arr1, arr2);
        
        System.out.print("Unsorted Array: ");
        for (int i=0; i<unsortedArray.length; i++){
            System.out.print(unsortedArray[i] + " ");
        }
        
        System.out.print("\nSorted Array: ");
        double [] sortedArray = BubbleSort(unsortedArray);
        for (int i=0; i<sortedArray.length; i++){
            System.out.print(sortedArray[i] + " ");
        }
        if (sortedArray.length %2 != 0){
            double median = sortedArray[sortedArray.length/2];
            System.out.println("\nMedian: " + median);
        }else{
            double median = (sortedArray[sortedArray.length/2] + sortedArray[sortedArray.length/2-1])/2.0;
            System.out.println("\nMedian: " + median);
        }
        
    }
    
    public static double [] merge(double [] arr1, double [] arr2){
        
        int s1 = arr1.length;
        int s2 = arr2.length;
        
        double [] result = new double [s1+s2]; //create new array
        
        int i=0, j=0, k=0;
        
        while (i<s1 && j<s2){
            if (arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
                k++;
            }else{
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i<s1){
            result[k++] = arr1[i++];
        }
        while (j<s2){
            result[k++] = arr2[j++];
        }
        return result;
    }
    
    public static double [] BubbleSort (double b []){
        for(int i=0; i<b.length; i++){
            for (int j=0; j<b.length-i-1; j++){
                if (b[j] > b[j+1]){
                    double temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
        return b;
    }
}
