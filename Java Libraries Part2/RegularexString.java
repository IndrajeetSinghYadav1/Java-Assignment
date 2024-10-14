// Write  a program to accept strings until 'end' is given and sort them and write them into Codes.txt and the string must be one/more alphabets followed by one/more digits.(use Regular Expressions)

import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class RegularexString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        Set<String> ts=new TreeSet<>();
        File f1=new File("Codes.txt");

        while(!(str=sc.nextLine()).equalsIgnoreCase("end")){
            if (Pattern.matches("[a-zA-z]+[0-9]+", str)){
                ts.add(str.toLowerCase());

            }
        }
           System.out.println(ts);
        try {
             FileWriter fw=new FileWriter(f1,true);
            for(String s:ts){
                fw.write(s);
                fw.write('\n');
            }
            fw.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
