package EmployeeProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import miniproject.IPL;

public class EmpDaoImplementation implements EmpDao {

	@Override
	public List<Employee> findAll() throws ClassNotFoundException, SQLException {
		ArrayList<Employee>list=new ArrayList<Employee>();
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Projects","root","root");
		PreparedStatement ps=con.prepareStatement("select * from emp");
		ResultSet rs=ps.executeQuery();
while(rs.next())
		{
	Employee e=new Employee();
			e.setEid(rs.getInt(1));
			e.setEname(rs.getString(2));
			e.setEdept(rs.getString(3));
			e.setEroll(rs.getString(4));
			e.setEsalary(rs.getString(5));
			list.add(e);
		}
		System.out.println("created successfully");
        return list;
		
	}

	@Override
	public void insertEmp(Employee e) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Projects","root","root");
		PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?,?,?) ");
		ps.setInt(1,e.getEid());
		ps.setString(2,e.getEname());
		ps.setString(3,e.getEdept());
		ps.setString(4,e.getEroll());
		ps.setString(5,e.getEsalary());
		ps.executeUpdate();
		con.close();
		}

	

	@Override
	public void deleteEmp(Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Projects","root","root");
		PreparedStatement ps=con.prepareStatement("delete from Employee where eid=?");
	
		
		ps.setInt(1, e.getEid());
		ps.executeUpdate();
		con.close();
		
	}

	@Override
	public void UpdateEmp(Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Projects","root","root");
		PreparedStatement ps=con.prepareStatement("update Employee set ename=?,edept=?,eroll=?,esalary=? where tid=?");
		
		ps.setString(1,e.getEname());
		ps.setString(2,e.getEdept());
		ps.setString(3,e.getEroll());
		ps.setString(4,e.getEsalary());
		ps.setInt(5,e.getEid());
		ps.executeUpdate();
		con.close();
	}
	
	

}
