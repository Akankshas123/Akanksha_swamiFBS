package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		
		System.out.println("Enter the operation\n1 addition\n2 substraction\n3 multiplication\n4 division\n5 mod");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		           case 1:
		        	   System.out.println("addition of two number "+(a+b)); 
		        	   break;
		           case 2:
			        	System.out.println("Substraction of two number "+(a-b)); 
			        	break;
			       case 3:
				        System.out.println("Multiplication of two number "+(a*b)); 
				        break;
				   case 4:
				        System.out.println("division of two number "+(a/b)); 
				        break;
				   case 5:
					    System.out.println("mod of two number "+(a%b)); 
					    break;
				   default:
					   System.out.println("Invalid choice"); 
					   break;
		}
		
		

	}

}
