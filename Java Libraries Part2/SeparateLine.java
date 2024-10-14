// Write a program to accept a string & display each word on a separate line (use any separator)

import java.util.Scanner;

public class SeparateLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split("[' '.',',';']");
        for(String k:arr){
            System.out.println(k);
        }
    }
}
