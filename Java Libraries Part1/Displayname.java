//Write a program to accept names until the END is given and display all the names separated by '-'.
import java.util.Scanner;

public class Displayname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="";
        String s;
        
        do
        {  
            s=sc.nextLine();
            if(s.equalsIgnoreCase("end")){
                break;
            }
          str+=s+"-";
          
        }
        while(!s.equalsIgnoreCase("end"));

       str=str.substring(0,str.length()-1);

        System.out.println(str);
    }
}
