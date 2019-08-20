package jdbc_20_08.service;

import java.util.List;

import jdbc_20_08.model.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);

}