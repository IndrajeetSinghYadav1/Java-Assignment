//Write a program to accept the number and display the largest factor other than the number.



import java.util.Scanner;

public class LargeFact {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int m=0;
        for(int i=1;i<n;i++){
            if (n%i==0){
                if(m<i){
                    m=i;
                }
                
            }
        }
        System.out.println("Largest Factor is "+m);
    }
}
