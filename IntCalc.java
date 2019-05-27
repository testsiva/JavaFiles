import java.util.*;

public class IntCalc {

	public static void main(String[] args)
	{
		
		System.out.println("Please Enter Number: ");
		IntCalc intCalc=new IntCalc();
		intCalc.getNumber();
		intCalc.countEvenOdd(intCalc.Number);
		System.out.println("Number of digits : " + countDigit(Number));
		intCalc.printDigits(Number);
		System.out.println("\n"+"Number of Prime digits : " + intCalc.primeCount);
		System.out.println("Number dividivisible by 2 except 4: " + intCalc.div2);
	}

	public static  long Number;
	private void getNumber()
	{
	Scanner scan = new Scanner(System.in);		
	
	Number = scan.nextLong();

	}
	void countEvenOdd(long n) 
	{ 
	    int even_count = 0; 
	    int odd_count = 0; 
	    while (n > 0)  
	    { 
	        long rem = n % 10; 
	        if (rem % 2 == 0) 
	            even_count++; 
	        else
	            odd_count++; 
	        n = n / 10; 	        
	    } 
	    System.out.println ( "Even count : " + even_count); 
	    System.out.println ( "Odd count : " +  odd_count); 
	    
	} 
	static int countDigit(long n) 
    { 
        return (int)Math.floor(Math.log10(n) + 1); 
    } 

	static int primeCount=0,div2=0;
	public static void printDigits(long num) {
		
	    if(num / 10 > 0) {
	        printDigits(num / 10);
	    }

	    	if(isPrime(num%10) == true)
		primeCount++;
		if((num%10) % 2 == 0 && (num%10) % 4 != 0)
		div2++;
	}

	public static boolean isPrime(long n) {  
       if (n < 2)  
           return false;  
        for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0)   
               return false;  
		 
       }  
       return true;  
   }   

	
	}
