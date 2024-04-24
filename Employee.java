package basic;

public class Employee {
	
	public double calculateSalary() {
		return 40000;
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		System.out.println("Base salary is: " +employee.calculateSalary());
		System.out.println("Bonus is: " +manager.calculateSalary());
		System.out.println("Total salary including bonus: " +(employee.calculateSalary()+manager.calculateSalary()));

	}
	
}
/*
	private int employee_id;
	private String name;
	private String department;
	
	public Employee(int employee_id, String name, String department) {
		this.employee_id = employee_id;
		this.name = name;
		this.department = department;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
*/	
	

