package cn.shhdemo1.service;

import java.util.List;

import cn.shhdemo1.entity.Employee;

/**
 * @description
 * @author 盛毅欣
 * @address 北大青鸟沈阳三好中心
 * @created 2017年10月9日 下午11:12:20
 * @version 1.0.0
 */
public interface EmployeeService {
	List<Employee> selectAll() throws Exception;
}
