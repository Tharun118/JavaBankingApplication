package basicBankApp;

import java.util.Scanner;

public class BankingApplication 
{
public static void main(String[]args)
{
	Application a=new Application("Tharun","CNRB001");
	a.showMenu();
}
}
class Application
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	Application(String customerName,String customerId)
	{
		 this.customerName=customerName;
		 this.customerId=customerId;
	}
	void deposit(int amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
			previousTransaction=amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount>0)
		{
			balance=balance-amount;
			previousTransaction=-amount;
		}
	}
	void previousTransaction()
	{
		if(previousTransaction >0)
		{
			System.out.println("Deposited "+"-->"+previousTransaction);
		}
		else if(previousTransaction<0)
		{
			System.out.println("Withdrawn "+"-->"+Math.abs(previousTransaction));
			//absolute(abs) method used to convert negative value to positive
		}
		else
		{
			System.out.println("No transaction happened");
		}
	}
	void showMenu()
	{
		char option='0';
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome dear"+ customerName);
		System.out.println("your customerId is "+ customerId);
		System.out.println();
		System.out.println("Enter A to check balance");
		System.out.println("Enter B to Deposit");
		System.out.println("Enter C to withdraw");
		System.out.println("Enter D to see previous Transaction");
		System.out.println("Enter E to Exit");
		
		do
		{
			System.out.println("==========***==========");
			System.out.println("Please Enter an Option");
			System.out.println("==========***==========");
			option=sc.next().charAt(0);
			System.out.println("\n");
			switch(option)
			{
			case 'A':
				System.out.println("---------------------");
				System.out.println("Balance = "+balance);
				System.out.println("---------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("----------------------");
				System.out.println("Enter the amount to deposit");
				System.out.println("----------------------");
				int amount=sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("-----------------------");
				System.out.println("Enter the amount to be witdrawn");
				System.out.println("-----------------------");
				int amount1=sc.nextInt();
				withdraw(amount1);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("----------------------");
				previousTransaction();
				System.out.println("----------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("-----------------------");
				break; 
				
			default:
				System.out.println("Invalid entrry please enter between A to E");
				break;
			}
		}while(option!='E');
		{
			System.out.println("Thank you for using our Banking services");
		}
	}
	
}
