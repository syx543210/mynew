package cn.shhdemo1.dao;

import java.util.List;

import cn.shhdemo1.entity.Employee;

/**
 * @description
 * @author 盛毅欣
 * @address 北大青鸟沈阳三好中心
 * @created 2017年10月9日 下午10:59:01
 * @version 1.0.0
 */
public interface EmployeeDao {
	//全查询
	public List<Employee> selectAll() throws Exception;
}
