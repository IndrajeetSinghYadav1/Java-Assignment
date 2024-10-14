//Write a program to display the file which contains the given string in a path.

import java.io.*;
import java.util.Scanner;

public class DisplayFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name :");
        String str=sc.nextLine();

        try {
            File f1=new File(str);
            if (f1.exists()){
               
                FileReader fr=new FileReader(f1);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                System.out.println(line);
            } 
            
            }
            else{
                System.out.println("No such File Found");
            }
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
