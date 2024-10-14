//Write a program to accept a filename from the user and display how many uppercase, lowercase and digits the file has.

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter File Name");
        String s=sc.nextLine();

        try{
            File f1=new File(s);
            FileReader fr=new FileReader(f1);
            int c;
            int upcount=0;
            int locount=0;
            int digcount=0;

            while((c=fr.read())!=-1){
                if(c>=65&&c<=90){
                    upcount++;
                     
                  }
                  else if(c>=97&&c<=122){
                     locount++;
                 
                  }
                  else if (c>=48&&c<=57){
                      digcount++;
                  }
            }
            System.out.println("Upper Case:"+upcount+" Lower Case:"+locount+" Digits:"+digcount);
            fr.close();
            sc.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
