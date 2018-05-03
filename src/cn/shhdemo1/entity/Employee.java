package cn.shhdemo1.entity;

import java.io.Serializable;

/**
 * @description
 * @author 盛毅欣
 * @address 北大青鸟沈阳三好中心
 * @created 2017年9月21日 上午8:52:39
 * @version 1.0.0
 */
public class Employee implements Serializable{
	private static final long serialVersionUID = 1919325445243210931L;
	
	//员工编号
	private Integer empId;
	//员工姓名
	private String empName;
	//员工薪水
	private Double salary;
	
	//多对一的关联映射关系
	private Dept dept;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
}
