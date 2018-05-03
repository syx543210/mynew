package cn.shhdemo1.service.impl;

import java.util.List;

import cn.shhdemo1.dao.EmployeeDao;
import cn.shhdemo1.entity.Employee;
import cn.shhdemo1.service.EmployeeService;

/**
 * @description
 * @author 盛毅欣
 * @address 北大青鸟沈阳三好中心
 * @created 2017年10月9日 下午11:15:26
 * @version 1.0.0
 */
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao employeeDao;
	
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> selectAll() throws Exception {
		return employeeDao.selectAll();
	}

}
