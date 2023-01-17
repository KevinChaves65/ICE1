/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author kevinchaves
 */
import java.util.Scanner;
public class ReverseWord {
    public static void main(String[] args){
        
        System.out.println("Enter word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        char[] myLetter = new char[word.length()];
        
        for (int i=(myLetter.length-1);i>=0;i--){
            myLetter[i]=word.charAt(i);
            System.out.println(myLetter[i]);
        }
    }
    
}
