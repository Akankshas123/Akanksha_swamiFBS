package main;
import java.util.Scanner;
import subclass.*;
public class Atmmain {

	public static void main(String[] args) {
        
	    int balance=50000;
	    System.out.println("enter your pin:");
	    Scanner sc = new Scanner(System.in);
	    int pin=sc.nextInt();
	    
	    Pincheck pc=new Pincheck();
	    Boolean a= pc.pincheck(pin);
   
	    if(a) {
	    	System.out.println("Enter your choice:\n1.check balance\n2Deposite\n3.Withdrawl");
	    	
	    	int choice=sc.nextInt();    
	    	switch(choice) {
	    	case 1:
	    		Checkbalnce cb = new Checkbalnce();
	    		cb.checkBalance(balance);
	    		break;
	    	case 2:
	    		Deposite dp = new Deposite();
	    		int amount =sc.nextInt();
	    		dp.deposite(balance, amount);
	    		break;
	    	case 3:
	    		Withdrawl wd = new Withdrawl();
	    		int amount1 = sc.nextInt();
	    		wd.withdrawl(balance,amount1);
	    		break;
	    	}
	    }
		
		

	}

}
