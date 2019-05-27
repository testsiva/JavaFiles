import java.util.*;

public class Matrix{
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Value of Square Matrix : ");
	int n;
	do
	{
	 n=scan.nextInt();
	 if(n%2==0)System.out.println("Please give only odd and Possitive Value :");
	 }while(n%2 == 0);
	int[][] array = new int[n][n];
	 int[] row=new int[n];
	int[] colm=new int[n];
	int[] diag=new int[2];
	int temp1=n-1;
	for(int i=0;i<n;i++)
	 {
	 for(int j=0;j<n;j++)
	  {
	  System.out.println("Enter the Value of Array["+i+"]["+j+"]");
	  array[i][j]=scan.nextInt();
	   row[i]+=array[i][j];
	  colm[i]+=array[j][i];
	  if(i == j)
	   {
	   diag[0]+= array[i][j];
	   }
	  }
	  diag[1]+= array[i][temp1];
	  temp1-=1;
	 }
	 System.out.println("Row wise added Array : ");
	 System.out.print("[");
	for(int i=0;i<n;i++)
	{
	 System.out.print(row[i] +"\n" );
	}
	 System.out.println("]");
	System.out.println("Column wise added Array : ");
	 System.out.print("[");
	for(int i=0;i<n;i++)
	{
	 System.out.print(colm[i] +"\t" );
	}
	 System.out.print("]");
	System.out.println("\n"+"Primary & Secondary Diagonal added Array : ");  
	System.out.println("["+diag[0] +"\t" +diag[1] +"]");
	}
}