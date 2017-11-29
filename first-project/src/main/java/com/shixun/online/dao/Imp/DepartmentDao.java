package com.shixun.online.dao.Imp;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shixun.online.dao.IDepartmentDao;
import com.shixun.online.model.Account;
import com.shixun.online.model.Department;

@Repository("departmentDao")
public class DepartmentDao implements IDepartmentDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 *  保存
	 */
	@Override
	public void saveDepartment(Department department) {
		Session session = sessionFactory.getCurrentSession();
		department.setCreateDate(new Date());
		session.save(department);
	}

	/**
	 *  更新
	 */
	@Override
	public boolean updateDepartment(Department department) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(department);
			return true;
		} catch (Exception e) {
			System.out.println("出现异常!!!");
		}
		return false;
	}

	/**
	 *  删除
	 */
	@Override
	public void removeDepartment(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Department department = (Department) session.get(Department.class, id);
		session.delete(department);
	}

	/**
	 *  查询department
	 */
	@Override
	public List<Department> getdepartment(int pageNow, int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Department");

		query.setFirstResult((pageNow - 1) * pageSize);
		query.setMaxResults(pageSize);
		List<Department> listDepartment = query.list();

		if (listDepartment.size() > 0) {
			return listDepartment;
		}
		return null;
	}

	/**
	 *  分页
	 */
	public int getDepartmentSize() {
		Session session = sessionFactory.getCurrentSession();
		int size = session.createQuery("from Department").list().size();
		return size;
	}

	/**
	 * 获取id
	 */
	@Override
	public Department get(Integer id) {
		return (Department) sessionFactory.getCurrentSession().get(Department.class, id);
	}

}
