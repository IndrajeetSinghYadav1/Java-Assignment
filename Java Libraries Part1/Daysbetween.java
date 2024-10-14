

//Write a program to accept starting_date and ending_date in DD-MM-YYYY format and display no of days between those two dates.

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Daysbetween {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting date in the format [yyyy-mm-dd]:");
        String strt=sc.nextLine();
        LocalDate ls=LocalDate.parse(strt);
        System.out.println("Enter the ending date in the format [yyyy-mm-dd]:");
        String end=sc.nextLine();
        LocalDate le=LocalDate.parse(end);
        long days=ChronoUnit.DAYS.between(ls, le);
        System.out.println("the no of days between "+strt+" and "+end+" is :");
        System.out.println(days);
       

    }
}
