package task6;

class Empolyee{

	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Empolyee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Empolyee [id= " + id + ", Name= " + firstName + " " + lastName + ", salary= " + salary
				+ "]";
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int annualSalary() {
		return salary*12;
	}
	
	public int raiseSalary(int percentage) {
	    int raisedSalary = (int) (salary + ((double) percentage / 100 * salary));
	    return raisedSalary;
	}

	
	
}



public class Employee {
	
	public static void main(String[] args) {
	
Empolyee emp = new Empolyee(101, "Santhosh", "U", 12000);
		
		
		System.out.println(emp.toString());
		
		System.out.println("Raised Slary: "+emp.raiseSalary(20));


	}

}
