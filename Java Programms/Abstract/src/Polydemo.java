abstract class Employee{
	int id;
	String name;
	double salary;
	Employee()
	{
		this.id=100;
		this.name="not given";
		this.salary=60000;
	}
	Employee(int id,String n,double s){
		this.id=id;
		this.name=n;
		this.salary=s;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	void display() {
		System.out.println("id is:"+id);
		System.out.println("Name is:"+name);
		System.out.println("salary is:"+salary);
	}
	 abstract double calsal();
//	 {
//		return salary;   //abstract class does not have method body 
//	}
//	

}

class Admin extends Employee {
	double allowance;
     
	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	Admin(){
		super();
		this.allowance=0;
	}
	Admin(int id,String n,double s,double al){
		super(id,n,s);
		this.allowance=al;
	}
	void display() {
		super.display();
		System.out.println("allowance is :"+allowance);
	}
	double calsal() {
		return salary + allowance;
	}

}


class Salsemanger extends Employee{
	int incentive,target;

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}
	 Salsemanger(){
		this.incentive=0;
		this.target=0;
	}
	 Salsemanger(int id,String n,double s,int i,int t){
		 super(id,n,s);
			this.incentive=i;
			this.target=t;
		}
	 void display() {
		 super.display();
		 System.out.println("incentive is"+incentive);
		 System.out.println("target is:"+target);
	 }
	 double calsal() {
			return salary + incentive;
		}
}


class Hr extends Employee{
	int commision;

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}
	Hr(){
		this.commision=0;
	}
	Hr(int id,String n,double s,int c){
		super(id,n,s);
		this.commision=c;
	}
void display() {
	super.display();
	System.out.println("commision is:"+commision);
}
double calsal() {
	return salary + commision;
}

}

class Polydemo {

	public static void main(String[] args) {
	    Employee e1;
//	    e1=new Employee(101,"aboli",60000);
//	    e1.display();
//	    System.out.println("Total salary of Employee is "+e1.calsal());

	    
	    e1=new  Salsemanger(102,"akii",3000,69,80);
	    e1.display();
	    System.out.println("Total salary of Sales Manager is "+e1.calsal());

	    
	    e1=new Admin(103,"mansi",57889,7);
	    e1.display();
		System.out.println("Total salary Admin is "+e1.calsal());
		

	    
	    e1=new Hr(104,"puja",6890,6000);
	    e1.display();
	    System.out.println("Total salary of HR is "+e1.calsal());


	}

}
