import java.util.*;
class Atm_operations
  {
    int balance;
    //withdraw
    void withdraw(int amt)
    {
      if(balance>amt)
      {
        balance=balance-amt;
        System.out.println("Withdraw succesfully");
        }
      else
      {
        System.out.println("Insufficient balance");
        }
      }
    //deposit
    void deposit(int amt)
    {
      balance=balance+amt;
      System.out.println("Deposit succesfully");
    }
    //check balance
    {
      System.out.println("balance");
    }
      }
class Atm
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Atm atm=new Atm();
      atm.balance=10000;
      char ch='y';
      do
        {
          System.out.println("1.withdraw\n 2.Deposit\n 3.checkbalance");
          System.out.println("select option");
          int option=sc.nextInt();
          switch(option)
            {
              case 1:
                System.out.println("Enter amount");
                int amount=sc.nextInt();
                atm.withdraw(amount);
                break;
                 case 2:
                System.out.println("Enter amount");
                int amount1=sc.nextInt();
                atm.Deposit(amount1);
                break;
                 case 3:
                atm.checkbalance();
                break;
              default :
                System.out.println("invalid option");
            }
                System.out.println("Do you want to continue");
                ch=sc.next().charAt(0);
            } while(ch == 'y');
    }
 }
        
  
  
      
    
  