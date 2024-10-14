//Write a program to create an interface called account operation with methods deposit(), getBalance().Implement this interface in Account class.

 interface AccountOperation {

    void deposit(int n);

    void getBalance();

    
}

class Account implements AccountOperation{

     
    int bal=0;

     public void deposit(int n){

          bal+=n;
          System.out.println("You Successfully deposited "+n);

     }

     public void getBalance(){

        System.out.println("Your Balance is "+bal);
     }

    
     public static void main(String[] args) {

        Account a=new Account();
        a.deposit(4999);
        a.getBalance();
        
    }

    
}
