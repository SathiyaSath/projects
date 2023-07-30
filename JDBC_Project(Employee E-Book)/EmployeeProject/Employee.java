package EmployeeProject;

public class Employee {
	private int eid;
	private String ename;
	private String edept;
	private String eroll;
	private String esalary;
	Employee()
	{
		
	}
	public Employee(int eid, String ename, String edept, String eroll, String esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
		this.eroll = eroll;
		this.esalary = esalary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public String getEroll() {
		return eroll;
	}
	public void setEroll(String eroll) {
		this.eroll = eroll;
	}
	public String getEsalary() {
		return esalary;
	}
	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edept=" + edept + ", eroll=" + eroll + ", esalary="
				+ esalary + "]";
	}
	
}
