//Write a program to create an array of 5 elements and store values into it by taking them from the keyboard and display them in reverse order.


import java.util.Scanner;

public class ArrayRev {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];

        System.out.println("Enter Array Elements:");

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Reverse Array is :");
        
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
