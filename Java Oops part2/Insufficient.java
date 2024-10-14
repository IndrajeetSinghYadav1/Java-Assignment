//Create an insufficientBalanceException Class with the message "Insufficient Balance X for withdrawal of Y".

import java.util.Scanner;


class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String m){
        super(m);
    }

}
public class Insufficient {


    static int bal=0; 

    static  void deposit(int d){
        bal+=d;
        System.out.println("your balance is :"+bal);
    }

    static void withdrawal(int w) throws InsufficientBalanceException{
        
            if (bal-w<0){
                throw new InsufficientBalanceException("Insufficient Balance X for withdrawal of Y");           
        }
        else{
            bal-=w;
            System.out.println("your balance is :"+bal);
        }
    
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Insufficient.deposit(5999);
        try {
            Insufficient.withdrawal(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        
        
        

    }
}
