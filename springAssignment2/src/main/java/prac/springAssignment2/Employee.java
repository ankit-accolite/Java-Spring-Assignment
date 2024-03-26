package prac.springAssignment2;

public class Employee {
	private String Fist_name;
	private String Last_name;
	private String EmpID;
	public String getFist_name() {
		return Fist_name;
	}
	public void setFist_name(String fist_name) {
		Fist_name = fist_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getEmpID() {
		return EmpID;
	}
	public void setEmpID(String empID) {
		EmpID = empID;
	}
	private Employee(String fist_name, String last_name, String empID) {
		super();
		Fist_name = fist_name;
		Last_name = last_name;
		EmpID = empID;
	}
	private Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [Fist_name=" + Fist_name + ", Last_name=" + Last_name + ", EmpID=" + EmpID + "]";
	}
}
