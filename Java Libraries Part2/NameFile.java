//Write a program to accept names from users until 'END' is given and write them into names.txt as one name for the line.
import java.io.*;
import java.util.Scanner;


public class NameFile {
    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in);
        String s;
        File f1=new File("Names.txt");
        System.out.println("enter the names :");
        try {
            FileWriter fw=new FileWriter(f1,false);
            
          //  BufferedWriter bw=new BufferedWriter(fw);
     
            while(!(s=sc.nextLine()).equalsIgnoreCase("end")){
                fw.append(s);
                fw.append('\n');
                
    
            }
           // bw.close();
            fw.close();
            
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
       
      
    }
}
