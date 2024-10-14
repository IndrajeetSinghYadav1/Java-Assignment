//Write a program to accept a file and convert its contents to uppercase.(write in compact way)

import java.io.*;
import java.util.Scanner;

public class ToUpper {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter File name:");
        String s=sc.nextLine();
        File f1=new File(s+".txt");

        try {
              FileReader fr=new FileReader(f1);
              RandomAccessFile raf=new RandomAccessFile(f1, "rw");
             // FileWriter Fw=new FileWriter(f1,true);

            
              
              int c;
              
              int count=0;
              while((c=raf.read())!=-1){
                

                //System.out.println(c);
                char s1=(char)c;
                if (c>=97&&c<=122){
                    c=c-32;
                    raf.seek(count);
                    raf.write(c);
                }
                count++;
              }
              fr.close();
             // Fw.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
}
