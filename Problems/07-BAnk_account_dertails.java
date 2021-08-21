/*BankAccountDetails
In the first round of HR interview for a banking sector,  HR decides to make candidates design an application which provides only  information on transaction like amount withdrawn with respect to fields given. Develop a program to implement this scenario. 

Create a class Account with the attributes: 

accountId  int
accountType String 
balance int
The method boolean withdraw(int) used  to calculate the current balance of the respective account. Before that it should enough balance.  If there is enough balance, deduct the amount from the balance and print "Balance amount after withdraw: XXX" and return true.  If there is no enough balance, print "Sorry!!! No enough balance" and return false. 

Create a class AccountDetails with main function and the below methods :

public Account getAccountDetails() -  This methods gets the input related to Account from the user and returns the Account object with all values set.  If the input given for balance is less than or equal to zero, consider it as invalid and display "Balance should be positive". Continue this kind of evaluation till user enters a positive value.

public int getWithdrawAmount() -  This methods gets the amount to be withdrawn as input from the user and returns the same.  If the input given for amount is less than or equal to zero, consider it as invalid and display "Amount should be positive". Continue this kind of evaluation till user enters a positive value.
Use appropriate getters and setters.

Note: Do not create a static reference for the Scanner class, create a scanner object inside the method.

Sample input 1:

Enter account id:

100
Enter account type:

Savings

Enter balance:

10000
Enter amount to be withdrawn:

500*/






package Problems;

import java.util.Scanner;

class Account
{
    private int accountid;
    private String accountType;
    private int balance;

    public int getaccountid()
    {
        return this.accountid;
    }
    public void setaccountid(int accountid)
    {
        this.accountid = accountid;
    }
    public String getaccountType()
    {
        return this.accountType;
    }
    public void setaccountType(String accountType)
    {
        this.accountType = accountType;
    }
    public int getbalance()
    {
        return this.balance;
    }
    public void setbalance(int balance)
    {
        this.balance = balance;
    }

    boolean withdraw(int w)
    {
        if(getbalance()>w){
            System.out.println("Balance amounr after withdraw:" + (getbalance()-w));
            return true;
        }
        else{
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
        
    }

}
public class Bank_account
{
    public static Account getAccountDetails()
    {
    
        Account obj = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account id:");
        obj.setaccountid(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter the account type:");
        obj.setaccountType(sc.nextLine());      
        int b;
        do
        {
            System.out.println("enter balance");
            obj.setbalance(sc.nextInt()); 
            b = obj.getbalance();
            if(b<=0)
            System.out.println("Balance should be Positive");
        }
        while(b<=0);
        return obj;

    }
    public static int getWithdrawAmount()
    {
        Scanner sc = new Scanner(System.in);
        int w;
        do
        {
            System.out.println("Enter the amount to be withdrawn");
            w = sc.nextInt();
            if(w<=0)
            System.out.println("Amount should be positive.");
        }
        while(w<=0);
        return w;
    }
    public static void main(String args[])
    {
        Account obj1 = new Account();
        obj1 = getAccountDetails();
        int c = getWithdrawAmount();
        obj1.withdraw(c);
    }
}
