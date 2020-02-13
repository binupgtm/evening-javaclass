package classabdobjectconcept;

public class Employee {
	String name;
	int salary;
	int id;
	 
	void CanWork() {
		System.out.println("he can work");
	}
	
	void DisplayEmployeeDetails(Employee employee){
		System.out.println("the name is:"+employee.name+ "salary:"+ employee.salary+ "id:"+ employee.id);
	}

	public static void main(String[] args) {
		Employee emp = new Employee ();
		emp.name = "Binup";
		emp.salary = 5000;
		emp.id = 512;
		emp.DisplayEmployeeDetails(emp);
		
		
		
		
	}

}
