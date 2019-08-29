package jdbc_20_08.dao;

import java.util.List;

import jdbc_20_08.model.Employee;

public interface EmployeeDao {
	
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	//public List<Employee> removeEmployee();
	public Employee getEmployeeById(int id);

}