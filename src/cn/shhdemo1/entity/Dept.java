package cn.shhdemo1.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


/**
 * @description 一的一方
 * @author 盛毅欣
 * @address 北大青鸟沈阳三好中心
 * @created 2017年9月21日 上午8:45:35
 * @version 1.0.0
 */
public class Dept implements Serializable{
	
	private static final long serialVersionUID = 6900856359068196806L;
	//部门编号
	private Integer deptId;
	//部门名称
	private String deptName;
	
	//一对多的关联映射关系
	private Set<Employee> emps=new HashSet<>();

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee> getEmps() {
		return emps;
	}

	public void setEmps(Set<Employee> emps) {
		this.emps = emps;
	}
	
	
}
