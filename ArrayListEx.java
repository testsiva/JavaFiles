import java.util.*;

public class ArrayListEx{
	public static void main(String args[]){

	Scanner scan = new Scanner(System.in);
	Map<Integer,ArrayList> empMap=new Hashtable<Integer,ArrayList>();
	int n=2;
	for(int i=0;i<n;i++){
	System.out.print("Emp Name : ");
	String empName=scan.next();
	System.out.print("Emp ID : ");
	int empId=scan.nextInt();
	System.out.print("Depratment : ");
	String dept = scan.next();
	System.out.print("Salary : ");
	int sal=scan.nextInt();
	if(i<n)System.out.println("Please give next Emp Details : ");
	ArrayList emp=new ArrayList();
	Employee e = new Employee(empName,sal,dept);
	emp.add(e.name);
	emp.add(e.salary);
	emp.add(e.dept);
	
	empMap.put(empId,emp);
	}
	scan.close(); 
	
	System.out.println(empMap);

	Map<Character,ArrayList> grdMap=new Hashtable<Character,ArrayList>();

	ArrayList gr1=new ArrayList();
	Grade a=new Grade(1000,4999);
	gr1.add(a.lowSal);
	gr1.add(a.highSal);
	grdMap.put('A',gr1);

	ArrayList gr2=new ArrayList();
	Grade b=new Grade(5000,14999);
	gr2.add(b.lowSal);
	gr2.add(b.highSal);
	grdMap.put('B',gr2);

	ArrayList gr3=new ArrayList();
	Grade c=new Grade(15000,29999);
	gr3.add(c.lowSal);
	gr3.add(c.highSal); 
	grdMap.put('C',gr3);
	
		
	System.out.println(grdMap);
	
	System.out.println("A Grade Value is : "+grdMap.get('A'));
	
	Iterator itr = grdMap.keySet().iterator();

	while (itr.hasNext())
	{
			
	System.out.println(itr.next());
	}
	
	// getting values for key "11"
	System.out.println(empMap.get(11));

	Set s = empMap.entrySet(); 
        // printing set entries. 
        System.out.println("set entries: " + s); 
	System.out.println("Hash values: " +empMap.values()); 

	//print values (arraylist) of map
	Set<Integer> keys = empMap.keySet();

	Iterator<Integer> itrEmp = keys.iterator();

	while(itrEmp.hasNext()) {
	ArrayList empAl = new ArrayList();
	
	empAl = empMap.get(itrEmp.next());
	
	ListIterator itList1 = empAl.listIterator();
	while(itList1.hasNext()) {
	System.out.println(itList1.next());
	}
	}
	System.out.println("....................");

	
 }  
}  
class Employee{  
  int salary;
  String name,dept;  
  Employee(String name,int salary,String dept){  
   this.salary=salary;  
   this.name=name;  
   this.dept=dept;  
  }  

}

class Grade{  
  int lowSal,highSal;
  Grade(int lowSal,int highSal){  
   this.lowSal=lowSal;  
   this.highSal=highSal;  
   }  
 	

}
