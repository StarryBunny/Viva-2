/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter password: ");
        String password = sc.next();
        System.out.println(validPassword(password));
    }
    
    public static boolean validPassword (String pw){
        if (pw.length() >= 8){
            if (checkPassword(pw)){
                System.out.println("Your pasword is valid");
                return true;
            }else{
                System.out.println("Your password is invalid");
                return false;
            }
        }else{
            System.out.println("Your password is invalid. \nIt is not enough length. \nMust contain aleast 8 characters. ");
            return false;
        }
    }
    
    public static boolean checkPassword (String pw){
        boolean hasCap = false;
        boolean hasLow = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        
        String specialCharacters = "!@#$%^&*()-_=+[]{};:,.<>?"; // Define set of special characters
        int digitCount = 0;
        int specialCharCount = 0;
        
        for (int i=0; i<pw.length(); i++){
            char c = pw.charAt(i); //check password character one by one
            if (Character.isUpperCase(c)){
                hasCap =  true;
            }else if (Character.isLowerCase(c)){
                hasLow =  true;
            }else if (Character.isDigit(c)){
                digitCount++;
                hasDigit =  true;
            }else if (specialCharacters.contains(String.valueOf(c))){
                specialCharCount++;
                hasSpecialChar = true;
            }else{
                return false;
            }
            
            if (hasCap && hasLow && hasDigit && hasSpecialChar && digitCount>=3 && specialCharCount==1){
                return true;
            }
        }
        return false;
    }
}
