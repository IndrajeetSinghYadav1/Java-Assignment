//Write a program to assume names1.txt & names2.txt where we have one name for line & display unique names from both the files in the order they appear.

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;
public class DisplayInOrder {
    public static void main(String[] args) {
        
        File f1=new File("Names1.txt");
        File f2=new File("Names2.txt");
        String line1,line2;
        Set <String> str=new LinkedHashSet<>();
        

        try {

            FileReader fr1=new FileReader(f1);
            FileReader fr2=new FileReader(f2);
            BufferedReader br1=new BufferedReader(fr1);
            BufferedReader br2=new BufferedReader(fr2);

            while(true){
                line1=br1.readLine();
                line2=br2.readLine();
                if(line1==null && line2==null){
                    break;
                }
                if(!(line1==null))
               str.add(line1);

                if(!(line2==null)){
                str.add(line2);
               }
               

                
            }

          System.out.println(str);
            
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }
    
}
