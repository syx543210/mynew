package cn.shhdemo1.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.shhdemo1.entity.Employee;
import cn.shhdemo1.service.EmployeeService;

/**
 * @description
 * @author 盛毅欣
 * @address 北大青鸟沈阳三好中心
 * @created 2017年10月9日 下午11:22:58
 * @version 1.0.0
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{

	private Employee employee=new Employee();
	List<Employee> employeeList;
	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public List<Employee> getEmployeeList() {
		return employeeList;
	}


	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	//全查询
	public String selectAll() throws Exception{
		employeeList=employeeService.selectAll();
		return SUCCESS;
	}
	
	@Override
	public Employee getModel() {
		return employee;
	}

}
