import java.util.*;
public class ArrayListCalc{

	public static void main(String[] args) {
		ArrayList<Integer> arList=new ArrayList<Integer>();
		arList.add(58);
		arList.add(50);
		arList.add(62);
		arList.add(853);
		arList.add(304);
int temp=0;
		System.out.println("The list is: \n"+ arList);
		ListIterator itr= arList.listIterator(arList.size());
		System.out.println("Reverse ArrayList elements are...");
	    while(itr.hasPrevious())
	    {
	      System.out.println(itr.previous());
	    }
		Collections.sort(arList);
	    System.out.println("The Sorted list is:"+ arList);
	    
	}

}
