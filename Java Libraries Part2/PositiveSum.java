

//Write a program to accept some numbers from the user until 'O' and display the sum of +ve numbers.
import java.util.Scanner;


public class PositiveSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b;
        int sum=0;
        System.out.println("Enter the Numbers:");
        while((b=sc.nextInt())!=0){
            if (b>0){
                sum+=b;
            }
        }
        System.out.println("Sum of +ve numbers are :"+sum);
          
        sc.close();
    }
    
}
