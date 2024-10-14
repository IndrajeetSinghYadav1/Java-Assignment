//Write a program to consider command line arguments num, length as inputs (where length is optional) if you won't get that use default number as length.


public class CommandLen {
    
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        if (args.length>0){
            System.out.println(args[0]);
        }
        else{
            System.out.println("Length is : 3");
        }
    }
}
