//Write 20 marks into Marks.data.

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File f1=new File("Marks.txt");

        try {
            FileWriter fw=new FileWriter(f1,true);

            System.out.println("Enter the 20 Marks:");
            for (int i = 0; i < 20; i++) {

                String s=sc.nextLine();
                fw.append(s);
                fw.append('\n');
                
            }
            fw.close();
        } 
        
        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
