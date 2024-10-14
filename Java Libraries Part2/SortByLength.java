// Create a treeset of strings and sort them by length (use Comparator)

import java.util.*;

public class SortByLength implements Comparator<String> {

    

   
    @Override
    public int compare(String o1, String o2) {
        // TODO Auto-generated method stub
        if (o1.length()>o2.length()){
            return 1;
        }
        else if(o1.length()<o2.length()){
            return -1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String> ts=new TreeSet<>(new SortByLength());
        String[] s1=new String[5];
        System.out.println("Enter 5 Strings:");
        for (int i = 0; i < s1.length; i++) {
            s1[i]=sc.nextLine();
            ts.add(s1[i]);
        }

        System.out.println(ts);

    
        
        
       }
}
