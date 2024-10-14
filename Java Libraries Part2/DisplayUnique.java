//Write a program to take names from names.txt & display unique names in sorted order.

import java.io.*;
import java.util.TreeSet;

public class DisplayUnique {
    public static void main(String[] args) {
        
        File f1=new File("DisplayNames.txt");
        TreeSet<String> ts=new TreeSet<>();
        
        try {
            FileReader fr=new FileReader(f1);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                String[] arr=line.split("[' ','\n',',']");
                for (int i = 0; i < arr.length; i++) {
                    ts.add(arr[i].toLowerCase());
                    
                }
            }
            System.out.println(ts);

        } catch (Exception e) {
        }
    }
    
}
