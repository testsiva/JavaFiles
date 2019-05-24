import java.util.*;

public class ArrayListEx{
	public static void main(String args[]){

	Scanner scan = new Scanner(System.in);
	Map<Integer,ArrayList> map=new Hashtable<Integer,ArrayList>();
	int n=2;
	for(int i=0;i<n;i++){
	System.out.print("Emp Name : ");
	String empName=scan.nextLine();
	System.out.print("Depratment : ");
	String dept = scan.nextLine();
	System.out.print("Emp ID : ");
	int empId=scan.nextInt();
	System.out.print("Salary : ");
	int sal=scan.nextInt();
	if(i<n)System.out.println("Please give next Emp Details : ");
	ArrayList<Employee> emp=new ArrayList<Employee>();
	Employee e = new Employee(empName,sal,dept);
	map.put(empId,emp);
	}
	scan.close();
	System.out.println(map);

	/*Employee e1=new Employee("Sonoo",23000,"sales");  
  	Employee e2=new Employee("Sonoo1",23001,"sales");  
  	Employee e3=new Employee("Sonoo2",23002,"sales");  
  	  
  //creating arraylist foe Emp Details
  ArrayList<Employee> emp=new ArrayList<Employee>();  
  emp.add(e1);
  emp.add(e2);  
  emp.add(e3);  
  //Getting Iterator  
  Iterator itr=emp.iterator();  
  //traversing elements of ArrayList object  
  while(itr.hasNext()){  
    Employee em=(Employee)itr.next();  
    System.out.println(em.name+" "+em.salary+" "+em.dept);  
  } */
	Grade a=new Grade(1000,4999);
	Grade b=new Grade(5000,14999);
	Grade c=new Grade(15000,29999);

	ArrayList<Grade> gr=new ArrayList<Grade>();
	gr.add(a);
	gr.add(b);  
	gr.add(c); 
	Iterator it=gr.iterator();  
  
  while(it.hasNext()){  
    Grade gritr=(Grade)it.next();  
    System.out.println(gritr.lowSal+" "+gritr.highSal);  
  } 
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
