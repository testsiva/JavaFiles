import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 obj =new Test1();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		String str=scan.nextLine();
		int nOL=obj.noOfLower(str);
		System.out.println("Total No Of Lower case : "+nOL);
		int nOU=obj.noOfUpper(str);
		System.out.println("Total No Of Upper case : "+nOU);
		int vowe=obj.vowel(str);
		System.out.println("Total No Of Vowels : "+vowe);
		obj.countOfEachVowels(str);
		int spaces = obj.noOfSpace(str);
		System.out.println("Total No Of Spaces : "+spaces);
		int special = obj.noOfSpecial(str);
		System.out.println("Total No Of Special Character : "+special);
		int num=obj.noOfNumbers(str);
		System.out.println("Total No Of Numbers : "+num);
		obj.reverseString(str);
		obj.customOut(str);
		
		scan.close();
	}
	int noOfLower(String nL)
	 {
		 int j=0;
		 for(int i=0;i<nL.length();i++)
		 {
			 if(Character.isLowerCase(nL.charAt(i)) == true)
			 j++;
			 
		 }return j;
		 
	 }
	int noOfUpper(String nL)
	 {
		 int j=0;
		 for(int i=0;i<nL.length();i++)
		 {
			 if(Character.isUpperCase(nL.charAt(i)) == true)
			 j++;
			 
		 }return j;
		 
	 }
	int vowel(String vow)
	{
		int j=0;
		for(int i=0;i<vow.length();i++)
		{
			if(vow.charAt(i) == 'a'|| vow.charAt(i) == 'e'|| vow.charAt(i) == 'i' ||vow.charAt(i) == 'o' ||vow.charAt(i) == 'u' || vow.charAt(i) == 'A'|| vow.charAt(i) == 'E'|| vow.charAt(i) == 'I' ||vow.charAt(i) == 'O' ||vow.charAt(i) == 'U' ) 
				j++;
		}return j;
	}
	void countOfEachVowels(String v)
	{
		int a=0,e=0,i=0,o=0,u=0;
		for(int k=0;k<v.length();k++)
		{
			if(v.charAt(k) == 'a' || v.charAt(k) == 'A')a++;
			if(v.charAt(k) == 'e' || v.charAt(k) == 'E')e++;
			if(v.charAt(k) == 'i' || v.charAt(k) == 'I')i++;
			if(v.charAt(k) == 'o' || v.charAt(k) == 'O')o++;
			if(v.charAt(k) == 'u' || v.charAt(k) == 'U')u++;
		}
		System.out.println("No Of 'A' :"+a);
		System.out.println("No Of 'E' :"+e);
		System.out.println("No Of 'I' :"+i);
		System.out.println("No Of 'O' :"+o);
		System.out.println("No Of 'U' :"+u);
	}
	int noOfSpace(String sp)
	{
		int j=0;
		for(int k=0;k<sp.length();k++)
		{
			if(sp.charAt(k) == ' ' )j++;
		}return j;
	}
	int noOfSpecial(String SPC)
	{
		int j=0;
		for(int k=0;k<SPC.length();k++)
		{
			char ch = SPC.charAt(k); 
            if (ch >= 'A' && ch <= 'Z'); 
            else if (ch >= 'a' && ch <= 'z'); 
            else if (ch >= '0' && ch <= '9');
            else
                j++;
		}return j;
	}
	int noOfNumbers(String SPC)
	{
		int j=0;
		for(int k=0;k<SPC.length();k++)
		{
			char ch = SPC.charAt(k); 
            if (ch >= '0' && ch <= '9')j++;            
		}return j;
	}
	void reverseString(String rev)
	{
		String[] a = rev.split(" ",0);
		String b = "";
		for(String w:a){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        b+=sb.toString()+" ";  
	    }  
		System.out.println("Reversed String is : "+b);
	}
	void customOut(String cus)
	{
		String small="",caps="",spl="",num="";
		for(int k=0;k<cus.length();k++)
		{
			char ch = cus.charAt(k); 
            if (ch >= 'A' && ch <= 'Z')caps+=String.valueOf(ch); 
            else if (ch >= 'a' && ch <= 'z')small+=String.valueOf(ch);  
            else if (ch >= '0' && ch <= '9')num+=String.valueOf(ch);
            else if (ch == ' ');
            else spl+=String.valueOf(ch); 
		
		}System.out.println("Custom Output :"+small+caps+num+spl);
	}
}
