package EmployeeProject;

import java.sql.SQLException;
import java.util.List;



public interface EmpDao {
	public List<Employee>findAll() throws ClassNotFoundException, SQLException;
	public void insertEmp(Employee e) throws ClassNotFoundException, SQLException;
	//public void UpdateEmp(Employee e) throws ClassNotFoundException, SQLException;
	public void deleteEmp(Employee e) throws ClassNotFoundException, SQLException;
	void UpdateEmp(Employee e) throws ClassNotFoundException, SQLException;
	
}
