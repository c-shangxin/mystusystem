package com.empsystem.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.empsystem.dao.IEmpDao;
import com.empsystem.entity.TbEmp;

@Repository("empDao")
public class EmpDaoImpl extends BaseDao implements IEmpDao {

	@Override
	public boolean addEmp(TbEmp emp) {
		try {
			getSession().save(emp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List findEmpList() {
		return getSession().createQuery("from TbEmp e left join e.dept").list();
	}

	//根据ID查
	@Override
	public TbEmp findEmpById(int id) {
	
		return getSession().get(TbEmp.class, id);
	}

	//修改
	@Override
	public boolean updateEmp(TbEmp emp) {
		getSession().update(emp);
		return true;
	}

	@Override
	public boolean deleteEmp(TbEmp emp) {
		try {
			getSession().delete(emp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
