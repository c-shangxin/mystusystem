package com.empsystem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.empsystem.dao.IEmpDao;
import com.empsystem.entity.TbEmp;
import com.empsystem.service.IEmpService;

@Service("empService")
@Transactional(propagation=Propagation.REQUIRED)
public class EmpServiceImpl implements IEmpService {

	@Resource(name="empDao")
	private IEmpDao empDao;
	@Override
	public boolean addEmp(TbEmp emp) {
		return empDao.addEmp(emp);
	}

	@Override
	public List findEmpList() {
		return empDao.findEmpList();
	}

	public void setEmpDao(IEmpDao empDao) {
		this.empDao = empDao;
	}

	//根据ID查
	@Override
	public TbEmp findEmpById(int id) {
		
		return empDao.findEmpById(id);
	}

	//修改
	@Override
	public boolean updateEmp(TbEmp emp) {
		
		return empDao.updateEmp(emp);
	}

	@Override
	public boolean deleteEmp(TbEmp emp) {
		//调用Dao方法
		return empDao.deleteEmp(emp);
	}
	
}
