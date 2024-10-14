// Write a program to accept the day of a week and the number of hours worked and calculate the wage.
// Conditions:
//      1,2,3 —>  Rs200/ hour
//         4,5  —> Rs400 / hour
//            6  —> Rs600 / hour
//            7  —> Rs800 / hour
//         1 to 7 is Monday to Friday.
//    If the total amount exceeds Rs2000 then there will be a bonus of 10%.  (Use Switch Expression)






import java.util.Scanner;

public class CalcWage {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        int n=sc.nextInt();
        System.out.println("Enter No of hours worked:");
        int h=sc.nextInt();
        int wage;
        switch (n) {
            case 1,2,3:wage=h*200;

                       if (wage>2000){

                          wage+=(wage*10)/100;

                       };

                       System.out.println("Total Wage is :" +wage);
                
                break;

            case 4,5:wage=h*400;
                
                      if (wage>2000){

                         wage+=(wage*10)/100;

                         };

                      System.out.println("Total Wage is :" +wage);
         
                    break;
            
            case 6:wage=h*600;
                
                    if (wage>2000){

                        wage+=(wage*10)/100;

                       };

                     System.out.println("Total Wage is :" +wage);
       
                  break;

            case 7:wage=h*800;
                
                  if (wage>2000){

                     wage+=(wage*10)/100;

                     };

                     System.out.println("Total Wage is :" +wage);
     
                break;
        
            default:
                System.out.println("Enter Valid Number");
        }
        sc.close();
    }
}
