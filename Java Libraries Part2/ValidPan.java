//Write a program to accept pan no and check whether it is valid or not.

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidPan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Pan no:");
        String pan=sc.nextLine();
        if(Pattern.matches("^[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}$", pan)){
            System.out.println("it is valid pan");
        }
        else{
            System.out.println("Invalid pan");
        }

    }
}
