// Write a program to accept a file and replace one (or) more spaces with a single space.

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList <String> arr=new ArrayList<>();

        try {
            File f1=new File(s+".txt");

            FileReader fr=new FileReader(f1);
            BufferedReader br=new BufferedReader(fr);
            
           
            String line;
            while(true){
                  line=br.readLine();
                 // System.out.println(line);
                  if(line==null){
                    break;
                  }
                  String re=line.replaceAll("[' ']+", " ");
                 // System.out.println(re);
                  arr.add(re);
                 
                  
            }

            

            fr.close();
            br.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            File f1=new File(s+".txt");
            FileWriter fw=new FileWriter(f1);
            for (int i = 0; i < arr.size(); i++) {

                System.out.println(arr.get(i));

                fw.write(arr.get(i));
                fw.write('\n');
                
            }
            fw.close();
        
            
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
