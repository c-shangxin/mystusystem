package com.empsystem.service;

import java.util.List;

import com.empsystem.entity.TbDept;

public interface IDeptService {

	public boolean addDept(TbDept dept);
	
	public List findDeptList();
}
