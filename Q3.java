package ExceptionHandling;
/*Q 3 	Write a program for user defined Exception that checks the external 
 * and internal marks if the internal marks is greater than 40 it raise
 *  the exception internal mark is exceed, 
 *  if the external mark is greater than 60 
 *  exception is raised and display the message the external marks is exceed, 
 *  create the above exception and use it in your program.
 * 
 */

public class Q3 {
	static void marks(int a,int b) {
	//internal marks=a
	//external mark=b
	try 
	{
		if(a>40)
			throw new Exception("internal mark is exceed");
		 if (b>60)
			throw new Exception("external mark is exceed");
		else
			System.out.println("internal and external marks are good");	
	}
	catch(Exception f) 
	{
		System.out.println(f.getMessage());
		
	}
	System.out.println("end the program");
		
	}
	
	

	public static void main(String[] args) {
		marks(30,70);
		
	}

}
