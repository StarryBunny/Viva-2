/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

public class Question3 {
    
    public static void main(String[] args) {
        
        String arr [] = {"0", "a", ".", "-5E7", "2e+8", "2e2e"};
        boolean [] result = isNumber(arr);
        
        System.out.print("{");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
            if (i != result.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
    
    public static boolean [] isNumber (String arr []){
        boolean [] result = new boolean[arr.length];
        for (int i=0; i<arr.length; i++){
            try{
                Double.parseDouble(arr[i]); //parse String to Double value
                result [i] = true;
            }
            catch (Exception E){
                result [i] = false;
            }
        }
        return result;
    }
}
