//Write a program to create a function that takes a set of integers and returns the largest of integers.

public class LargeInt {

    public static void largeInt(int...n){

        int i;
        int max=n[0];
        for ( i=1;i<n.length;i++){
            if(max<n[i]){
                max=n[i];
            }
            
        }

        System.out.println("Largest Number is :"+max);
    }

    public static void main(String[] args) {
        
        largeInt(10,32,43,876);
    }
    
}
