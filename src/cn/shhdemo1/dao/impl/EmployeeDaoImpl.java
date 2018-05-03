package cn.shhdemo1.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.shhdemo1.dao.EmployeeDao;
import cn.shhdemo1.entity.Employee;

/**
 * @description
 * @author 盛毅欣
 * @address 北大青鸟沈阳三好中心
 * @created 2017年10月9日 下午11:04:10
 * @version 1.0.0
 */
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao{
	
	@Override
	public List<Employee> selectAll() throws Exception {
		String hql="from Employee";
		return super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql).list();
	}
	
}
