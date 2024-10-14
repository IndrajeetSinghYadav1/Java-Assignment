//Write a program to guess the random number in three attempts. The range is (1 to 25)



import java.util.Scanner;

class Random{

    public static void main(String[] args) {
        
        int m=(int)(Math.random()*26);
        Scanner sc=new Scanner(System.in);

        for (int i = 1; i < 4; i++) {

            System.out.println("Enter your guess number");
            int g=sc.nextInt();
            if (m==g){
                System.out.println("You have correctly guessed the number");
                break;
            }
            else{
                System.out.println("try again");
            }

            
        }
    }
}