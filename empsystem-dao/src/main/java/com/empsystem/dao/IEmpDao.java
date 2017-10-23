package com.empsystem.dao;

import java.util.List;

import com.empsystem.entity.TbEmp;

public interface IEmpDao {

	public boolean addEmp(TbEmp emp);
	
	public List findEmpList();
	
	public TbEmp findEmpById(int id);
	
	public boolean updateEmp(TbEmp emp);
	
	public boolean deleteEmp(TbEmp emp);
}
