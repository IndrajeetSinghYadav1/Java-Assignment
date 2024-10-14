//Write a program to display lines that contains more than 5 characters.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;



public class Morethan5 {
    public static void main(String[] args) {

        try {

            File f1=new File("Display.txt");
            FileReader fr=new FileReader(f1);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
               
                if(line.length()>5){
                    System.out.println(line);
                }
            }
            fr.close();
            br.close();

            
        } catch (Exception e) {
        }
        
    }
}
