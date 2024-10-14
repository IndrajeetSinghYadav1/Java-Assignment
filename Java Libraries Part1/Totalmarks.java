//Write a program to accept a string that contains marks separated by commas and display total.

import java.util.Scanner;

public class Totalmarks {
    

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter marks separated by commas:");
        String s=sc.nextLine();
        String[] sp=new String[s.length()];
        sp=s.split("[,]");
        int total=0;
        
        for(int i=0;i<sp.length;i++){
            total+=Integer.parseInt(sp[i]);
        }
        
        System.out.println("total marks is :"+total);
       

    }
}
