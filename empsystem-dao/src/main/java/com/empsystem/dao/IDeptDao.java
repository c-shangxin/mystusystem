package com.empsystem.dao;

import java.util.List;

import com.empsystem.entity.TbDept;

public interface IDeptDao {

	public boolean addDept(TbDept dept);
	
	public List findDeptList(String hql);
}
