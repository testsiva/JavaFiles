import java.util.*;
public class ExceptionHandling {

	public static void main(String[] args ) 
	{
		int n=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=scan.nextInt();
		int a[]=new int[n];
		try 
		{
				
		for(int i=0;i<=n;i++)
		{
			System.out.println("Enter the Value of array["+i+"]");
			a[i]=scan.nextInt();
			if(a[i] >100)
			a[i]/=0;

		}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input Mismatch Exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Out of Bound Exception");
		}
		catch(IllegalStateException e)
		{
			System.out.println("Illegal State Exception");
		}
		catch(ArithmeticException e){
      			System.out.println("Arithmatic Exception");
   		}
		catch(Exception e)
				{
			System.out.println("Unknown Exception");
		}
		finally
		{
			System.out.println("Finally block is excecuted");
			scan.close();
		}
		System.out.println("The Array is: ");
		
		for (int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
		}
	
	}
		
	


