//Write a program to accept five numbers from the user and display the average of numbers


import java.util.Scanner;

public class Avg {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("Enter First Number:");
        a=sc.nextInt();
        System.out.println("Enter Second Number:");
        b=sc.nextInt();
        System.out.println("Enter Third Number:");
        c=sc.nextInt();
        System.out.println("Enter Fourth Number:");
        d=sc.nextInt();
        System.out.println("Enter Fifth Number:");
        e=sc.nextInt();
        int avg=(a+b+c+d+e)/5;
        System.out.println("Average is :"+avg);
    }
}
