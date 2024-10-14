//Accept five strings which contain numbers and display the total for those numbers. Make your program fault tolerant.

import java.util.Scanner;

public class FaultTol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=new String[5];
        int count=0;
        int sum=0;
        for (int i = 0; i < str.length; i++) {

            System.out.println("Enter "+(i+1)+" value :");
           
            str[i]=sc.nextLine();
            try {
                Integer.parseInt(str[i]);

            } catch (NumberFormatException e) {
                count++;
                System.out.println("Error.. Enter only numerical values");
                break;
            }
            
            
        }
        
      
        if(count==0){

            for (int i = 0; i < str.length; i++) {
            
                
                sum+=Integer.parseInt(str[i]);
            
           
        }
        System.out.println("total is :"+sum);
        }
     

        
    }
}
