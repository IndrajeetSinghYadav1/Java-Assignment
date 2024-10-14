//Write a program to accept a string and display the position of space for all spaces.

import java.util.Scanner;



public class Spaceposition {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string :");
        String s=sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                System.out.println("Space is at position:"+(i+1));
            }
            
        }
    }
}
