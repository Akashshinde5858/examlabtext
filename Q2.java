package ExceptionHandling;

import java.util.Scanner;

public class Q2 {
	 int power(int x,int y)
	{
		
		int result=0;
		try
		{
			if (x<0||y<0)
				throw new Exception("x & y should not be negetive");
			else if (x==0||y==0)
				throw new Exception("x & y should not be zero");
			else
				result=(int) Math.pow(x, y);
			 
				
		}
		catch(Exception a)
		{
			System.out.println(a.getMessage());
		}
		return result;
		
		
	}

	public static void main(String[] args) {
		
		Q2 q=new Q2();
		System.out.println("enter the two value");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(q.power(a,b));
		
		
		/*
		 * int x=q.power(10,0);
		 * System.out.println(x);
		 */
		
		
		// TODO Auto-generated method stub

	}

}
