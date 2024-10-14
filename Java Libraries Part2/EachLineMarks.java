

// File Marks.txt, which have marks separated by comma in different lines.Find the total marks of each line and display them.(Use fault tolerance)


import java.io.*;

public class EachLineMarks {
    public static void main(String[] args) {
        
        int tot=0;
        File f1=new File("Marks.txt");
        

        String line;

        try {

            FileReader fr=new FileReader(f1);
            BufferedReader br=new BufferedReader(fr);
            while (true) { 
                line=br.readLine();

                if(line==null){
                    break;
                }

                String[] str=line.split("[',']");

                for (int i = 0; i < str.length; i++) {
                     tot+=Integer.parseInt(str[i]);
                    // System.out.println(str[i]);
                }

                System.out.println("total is:"+tot);

                tot=0;

            }
        }
          
            
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
