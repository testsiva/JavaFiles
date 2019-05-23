import java.util.*;

public class MultiArray{
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Value of Row and Column");
	do
	{
	 int n=scan.nextInt();
	 int b=n%2;
	 if(b==0)
	 System.out.println("Please give only odd and Possitive Value :");
	 }
	 while(b);
	int[][] array = new int[n][n];
	for(int i=0;i<n;i++)
	 {
	 for(int j=0;j<n;j++)
	  {
	  System.out.println("Enter the Value of Array["+i+"]["+j+"]");
	  array[i][j]=scan.nextInt();
	  }
	 }
	int[] row=new int[n];
	int[] colm=new int[n];
	int[] diag=new int[2];
	int temp=0;
	for(int i=0;i<n;i++)
	 {
	  for(int j=0;j<n;j++)
	  {
	  row[i]+=array[i][j];
	  colm[j]+=array[j][i];
	  if(i == j)
	   {
	   diag[0]+= array[i][j];
	   }
	  if(i == (n-1) && j==temp)
	  {
	  temp++;
	  diag[1]+=array[i][j];
	  }
	  }
	 }
	 Sytem.out.println("Row wise added Array : ");
	 System.out.print("[");
	for(int i=0;i<n;i++)
	{
	 System.out.print(row[i] +"\t" );
	}

	System.out.println("Column wise added Array : ");
	 System.out.print("[");
	for(int i=0;i<n;i++)
	{
	 System.out.print(colm[i] +"\t" );
	}
	System.out.println("Primary & Secondary Diagonal added Array : ");  
	System.out.println("["+diag[0] +"\t" +diag[1] +"]");
	}
}