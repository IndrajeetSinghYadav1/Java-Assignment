//Write a program to create a function that takes multiple numbers and displays common factors.


public class CommonFact {

    public static void commonFact(int...n){
        int i,j;
        

        int min=n[0];
        for(i=1;i<n.length;i++){
            if(n[i]<min){
               min=n[i];
            }
        }


        int [] arr=new int[min];
        j=0;
        for (i=1;i<=min;i++){
            if (min%i==0){
                arr[j]=i;
                j++;
            }
        }

    
    
      for (i=0;i<arr.length;i++){
            if (arr[i]==0){
                break;
            }
            int count=0;
        for (j=0;j<n.length;j++){
            
            if (n[j]%arr[i]!=0){
                count++;

            }
           
        }
        if (count==0){
                System.out.println("common Factor is :"+arr[i]);
        }
      }

    }
    
    public static void main(String[] args) {
        commonFact(8,48,4,6,32);
    }
}
