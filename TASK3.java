import java.util.Scanner;
public class TASK3
{
    public static void main(String args[] )
    {
        int balance = 87543, withdraw, deposit;
        while (true) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("     ATM     ");
            System.out.println(" choose 1 for cash withdraw ");
            System.out.println(" choose 2 for cash deposit ");
            System.out.println(" choose 3 for check balance ");
            System.out.println(" choose 4 for exit ");
            System.out.println(" choose the operation");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println(" enter money to be withdraw ");
                    withdraw = sc.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println(" withdraw successfull ");
                    System.out.println(" ensure to collect your money ");
                    System.out.println(" balance after withdraw " + balance);
                }
                else
                {
                    System.out.println(" Insufficient balance ");
                }
                break;
                case 2:
                    System.out.println(" Enter money to deposit: ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println(" your money has been successfully deposit ");
                    System.out.println(" money after deposit " + balance);
                break;
                case 3:
                    System.out.println(" balance : " + balance);
                break;
                case 4:
                    System.exit(0);
                
            }
            
        }
    }
}

