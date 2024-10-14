//Write a program to take a String and invert the case of characters.

import java.util.Scanner;

public class Invertcase {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String :");
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90){
                ch+=32;
                sb.append(ch);
            }
            else if (ch>=97 && ch<=122){
                ch-=32;
                sb.append(ch);
            }
            
        }
        System.out.println("inverted String is:");
        System.out.println(sb);
    }
}
