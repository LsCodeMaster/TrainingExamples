
public class Emp {
	private Integer employee_id;
	private String first_name;
	private Integer salary;
	
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String toString(){
		return "employee_id: " + employee_id + ", " + "first_name: " + first_name + ", " + "salary: " + salary;
	}
}
