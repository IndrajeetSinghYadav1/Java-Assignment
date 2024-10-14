


//Write a program to create an array of 10 elements, fill it with random no's and display array elements which are greater than average of array.


import java.util.Scanner;
public class Arrayavg {
    

    public static void main(String[] args) {
        
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        double avg;
        int sum=0;

        for(int i=0;i<10;i++){
            int r=(int)(Math.random()*100);
            arr[i]=r;
        }

        System.out.println("Array Elements are:");

        for (int l : arr) {
            System.out.println(l);
            
        }

        System.out.println("----------------------------------------");
        for (int i = 0; i < 10; i++) {
            sum+=arr[i];

        }
        avg=sum/arr.length;

        System.out.println("Average is :"+avg);

        System.out.println("Array elements greater than average "+avg+"are:");

        for (int i = 0; i < 10; i++) {
            if (arr[i]>avg){
                System.out.println(arr[i]);
            }
        }

    }
}
