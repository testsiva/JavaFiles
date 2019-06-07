import java.util.*;


public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Map<Integer,ArrayList<Employee1>> empMap=new Hashtable<Integer,ArrayList<Employee1>>();
		
		int n=3;
		for(int i=0;i<n;i++){
			System.out.println("Please give Emp Details : ");
			System.out.print("Emp Name : ");
			String empName=scan.next();
			System.out.print("Emp ID : ");
			int empId=scan.nextInt();
			System.out.print("Depratment : ");
			String dept = scan.next();
			System.out.print("Salary : ");
			int sal=scan.nextInt();
			//if(i<n)System.out.println("Please give next Emp Details : ");
			ArrayList<Employee1> emp = new ArrayList<Employee1>();
			Employee1 e = new Employee1();
			e.setter(empId,empName,sal,dept);
			emp.add(e);
			empMap.put(empId,emp);
		}
		scan.close(); 
				
		Map<Character,ArrayList<Grade>> grMap=new Hashtable<Character,ArrayList<Grade>>();
		
		ArrayList<Grade> gr1=new ArrayList<Grade>();
	  	Grade a=new Grade();
		a.setter('A',1000,4999);
		gr1.add(a);
		grMap.put('A',gr1);
		
		ArrayList<Grade> gr2=new ArrayList<Grade>();
		Grade b=new Grade();
		b.setter('B',5000,14999);
		gr2.add(b);
		grMap.put('B',gr2);

		ArrayList<Grade> gr3=new ArrayList<Grade>();
		Grade c=new Grade();
		c.setter('C',15000,29999);
		gr3.add(c);
		grMap.put('C',gr3);

	
		Calc calc = new Calc();
		calc.salesDept(empMap);
		calc.sal7_5k(empMap);
		calc.bGrade(empMap,grMap);
		int highSal = calc.hSal(empMap,grMap);
		int lowSal = calc.lSal(empMap);
		calc.hSalLSal(empMap,grMap,highSal,lowSal);
	}
	
		}
class Calc{
	public void salesDept(Map<Integer, ArrayList<Employee1>> empMap) {

	Set<Integer> keys = empMap.keySet();
	
	Iterator<Integer> itrEmp = keys.iterator();
	Employee1 x = new Employee1();
	System.out.println(".....................");
	System.out.println("Sales Dept Employee :");
	System.out.println(".....................");
	while(itrEmp.hasNext()) {
	ArrayList<Employee1> alst = new ArrayList<Employee1>();
	
	alst = empMap.get(itrEmp.next());
	
	x= alst.get(0);
	if(x.getDept().equals("sales")) System.out.println(x.getName());
	}
	}
	
	public void sal7_5k(Map<Integer, ArrayList<Employee1>> empMap)	{
	
		Set<Integer> keys = empMap.keySet();
		Iterator<Integer> itrEmp = keys.iterator();
		
		Employee1 x = new Employee1();
		System.out.println("............................");
		System.out.println("Salary Above 7500 Employee :");
		System.out.println("............................");
		while(itrEmp.hasNext()) {
		ArrayList<Employee1> alst = new ArrayList<Employee1>();
		
		alst = empMap.get(itrEmp.next());
		x= alst.get(0);
		if(x.getSal() > 7500) System.out.println(x.getName()+"\t"+x.getEmpId()+"\t"+x.getSal());
	}
	}
	
	public void bGrade(Map<Integer, ArrayList<Employee1>> empMap, Map<Character, ArrayList<Grade>> grMap) {
	
		Set<Integer> keys = empMap.keySet();
		Set<Character> grKey = grMap.keySet();
		
		Iterator<Integer> itrEmp = keys.iterator();
		
		Employee1 x = new Employee1();
		System.out.println(".....................");
		System.out.println("B Grade Employee :");
		System.out.println(".....................");
		while(itrEmp.hasNext()) {
		ArrayList<Employee1> alst = new ArrayList<Employee1>();
		
		alst = empMap.get(itrEmp.next());
		x= alst.get(0);
		
		Iterator<Character> itrGr = grKey.iterator();
		
		while(itrGr.hasNext()) {
			ArrayList<Grade> alst1 = new ArrayList<Grade>();
			
			alst1 = grMap.get(itrGr.next());
			Grade y = new Grade();
			y = alst1.get(0);
			
			if(x.getSal() >= y.getLowSal() && x.getSal() <= y.getHighSal() && y.getGrade() == 'B') System.out.println(x.getName()+"\t"+x.getSal());
			
		}
		
		}
	}
	
	public int hSal(Map<Integer, ArrayList<Employee1>> empMap, Map<Character, ArrayList<Grade>> grMap) {
		int salComp,salComp1=0,highSal=0;
		Set<Integer> keys = empMap.keySet();
			
		Iterator<Integer> itrEmp = keys.iterator();
		
		Employee1 x = new Employee1();
		while(itrEmp.hasNext()) {
			ArrayList<Employee1> alst = new ArrayList<Employee1>();
			
			alst = empMap.get(itrEmp.next());
			x= alst.get(0);
			
			salComp=x.getSal();
			if(highSal == 0)
				{
				salComp1 =salComp;
				highSal=salComp1;
				}
			if(salComp > salComp1) 
			{
				highSal=salComp;
				salComp1=highSal;
			} 
			}
		System.out.println(".....................");
		System.out.println("Highest Salary is :"+highSal);
		return highSal;
	}
	public void hSalLSal(Map<Integer, ArrayList<Employee1>> empMap, Map<Character, ArrayList<Grade>> grMap,int highSal,int lowSal) {
		
		Set<Integer> keys = empMap.keySet();
		Set<Character> grKey = grMap.keySet();
		Character ch1='C',ch2='A';
		Iterator<Integer> itrEmp = keys.iterator();
		
		Employee1 x = new Employee1();
		
		while(itrEmp.hasNext()) {
		ArrayList<Employee1> alst = new ArrayList<Employee1>();
		
		alst = empMap.get(itrEmp.next());
		x= alst.get(0);
		
		Iterator<Character> itrGr = grKey.iterator();
		
		while(itrGr.hasNext()) {
			ArrayList<Grade> alst1 = new ArrayList<Grade>();
			
			alst1 = grMap.get(itrGr.next());
			Grade y = new Grade();
			y = alst1.get(0);
			if(highSal >= y.getLowSal() && highSal <= y.getHighSal())ch1 = y.getGrade();
			if(lowSal >= y.getLowSal() && highSal <= y.getLowSal())ch2 = y.getGrade();
		}
		if(x.getSal() ==highSal) System.out.println("High Salary Employee :"+"\n"+x.getName()+"\t"+x.getEmpId() +"\t"+x.getSal()+"\t"+ch1);
		if(x.getSal() ==lowSal) System.out.println("Low Salary Employee :"+"\n"+x.getName()+"\t"+x.getEmpId() +"\t"+x.getSal()+"\t"+ch2);
		}
	}
	public int lSal(Map<Integer, ArrayList<Employee1>> empMap) {
		int salComp,salComp1=0,lowSal=0;
		Set<Integer> keys = empMap.keySet();
		Iterator<Integer> itrEmp = keys.iterator();
		
		Employee1 x = new Employee1();
		while(itrEmp.hasNext()) {
			ArrayList<Employee1> alst = new ArrayList<Employee1>();
			
			alst = empMap.get(itrEmp.next());
			x= alst.get(0);
			
			salComp=x.getSal();
			if(lowSal == 0)
				{
				salComp1 =salComp;
				lowSal=salComp;
				}
			if(salComp < salComp1) 
			{
				lowSal=salComp;
				salComp1=lowSal;
			}
			}
		System.out.println("Lowest Salary is :"+lowSal);
		return lowSal;
	}
	
	
}


		class Employee1{  
		 private int salary,empId;
		 private String name,dept;  
		 public void setter(int empId,String name,int salary,String dept){  
		  this.salary=salary;  
		  this.name=name;  
		  this.dept=dept; 
		  this.empId=empId;
		  
		}
		 public String getName() {
		      return name;
		   }

		   public int getEmpId() {
		      return empId;
		   }
		   public int getSal() {
			      return salary;
			   }
		   public String getDept() {
			      return dept;
			   }
		   
		   
		}
		class Grade{  
			  private int lowSal,highSal;
			  private Character grade;
			  public void setter(Character grade,int lowSal,int highSal){  
			   this.lowSal=lowSal;  
			   this.highSal=highSal;
			   this.grade = grade;
			   } 

			  public int getLowSal() {
			      return lowSal;
			   }
			   public int getHighSal() {
				      return highSal;
				   }
			   public char getGrade() {
				      return grade;
				   }
			}

