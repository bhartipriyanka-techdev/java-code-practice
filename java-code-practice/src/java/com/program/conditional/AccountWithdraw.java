package java.com.program.conditional;
import java.util.*;

public class AccountWithdraw {
	public static void main(String[] args) {
		 
    	Scanner sc=new Scanner(System.in);
    	
    	//Here input Total balance 
    	//Input Amount which you want to withdraw and also bank code
    
    	System.out.println("Enter total balance :");
    	int balance=sc.nextInt();
    	
    	System.out.println("Enter Amount : ");
    	int amount=sc.nextInt();
    	
    	System.out.println("Enter bank Code : ");
    	int bankCode=sc.nextInt();
    	
    	//Here checking condition for withdraw the amount 
    	
    	if(amount<=balance)
    	{
    		balance=balance-amount;
    	}
    	
		//if bank code is 2 and 4 then minimum balance should be 10000

    	
    	else if(bankCode==2||bankCode==4)
    	{
    		
    	}
    	
    	sc.close();
		
		//Here input amount for withdraw
		
		
		
	}

}
