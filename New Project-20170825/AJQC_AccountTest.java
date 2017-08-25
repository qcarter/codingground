// Fig. 3.13: Account.java
// Account class with a constructor to validate and
// initialize instance variable balance of type double.

public class Account
{
private double balance; // instance variable that stores the balance

// constructor
public Account( double initialBalance )
{
// validate that initialBalance is greater than 0.0;
// if it is not, balance is initialized to the default value 0.0
if ( initialBalance > 0.0 )
balance = initialBalance;
} // end Account constructor 

// credit (add) an amount to the account
public void credit( double amount )
{
balance = balance + amount; // add amount to balance
} // end method credit

// return the account balance
public double getBalance()
{
return balance; // gives the value of balance to the calling method
    } // end method getBalance
} // end class Account

// Fig. 3.14: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest
{
// main method begins execution of Java application
public static void main( String[] args )
{
Account accountl = new Account( 50.00 ); // create Account object
Account account2 = new Account( -7.53 ); // create Account object

// display initial balance of each object
System.out.printf( "accountl balance: $%.2f\n",
account1.getBalance() );
System.out.printf( "account2 balance: $%.2f\n\n",
account2.getBalance() );

// create Scanner to obtain input from command window
Scanner input = new Scanner( System.in );
double depositAmount; // deposit amount read from user

System.out.print( "Enter deposit amount for accountl: " ); // prompt
depositAmount = input.nextDouble(); // obtain user input
System.out.printf( "\nadding %.2f to accountl balance\n\n",
depositAmount );
accountl.credit( depositAmount ); // add to accountl balance

// display balances
System.out.printf( "accountl balance: $%.2f\n",
accountl.getBalance() );
System.out.printf( "account2 balance: $%.2f\n\n",
account2.getBalance() );

System.out.print( "Enter deposit amount for account2: " ); // prompt
depositAmount = input.nextDouble(); // obtain user input
System.out.printf( "\nadding %.2f to account2 balance\n\n",
depositAmount );
account2.credit( depositAmount ); // add to account2 balance

// display balances
System.out.printf( "accountl balance: $%.2f\n",
accountl.getBalance() );
System.out.printf( "account2 balance: $%.2f\n",
account2.getBalance() );
	} // end main
} // end class AccountTest

