// Assume a txt file customers.txt which contains name & mobile no and you need to display in sorted order of name.(Use regular expression)

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class CustomerSort {
    public static void main(String[] args) {
        File f1=new File("Customers.txt");
        String line;
        Map<String,String> mp=new TreeMap<>();
        try {
            FileReader fr=new FileReader(f1);
            BufferedReader br=new BufferedReader(fr);
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }

                if(line.matches("[a-zA-Z]+ [0-9]{10}"))
                {
                    String[] arr=line.split("[' ']");
                
                    mp.put(arr[0], (arr[1]));
                }
                

            }
            for(String key:mp.keySet()){
                System.out.println("Name,Ph No :"+key+","+mp.get(key));
            }
            br.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
