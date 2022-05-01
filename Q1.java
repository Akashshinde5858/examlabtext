package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Q 1	Take two integers  and  as input, you have to compute  x/y . If   x and  y  are not  integers or if  is zero , 
 * exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
 */

public class Q1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter two value");
		
		try{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=x/y;
			System.out.println(z);
		}
		
		catch(ArithmeticException a) 
		{
			System.out.println("dont enter the zero");
			
		}
		
		catch(InputMismatchException b) 
		{
			System.out.println("you enter the character so please enter the integer ");
			
		}
		
		catch(Exception f) 
		{
			System.out.println(f.getMessage());
			f.printStackTrace();
		}
		
		System.out.println("program end ");
	}
	

}
