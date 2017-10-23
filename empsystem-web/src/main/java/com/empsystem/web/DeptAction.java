package com.empsystem.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.empsystem.entity.TbDept;
import com.empsystem.service.IDeptService;

@Controller("deptAction")
@Scope("prototype")
public class DeptAction {

	private TbDept dept;
	
	//依赖IDeptService
	@Resource(name="deptService")
	private IDeptService deptService;
	
	//添加部门
	public String addDept(){
		deptService.addDept(dept);
		return "index";
	}

	public TbDept getDept() {
		return dept;
	}

	public void setDept(TbDept dept) {
		this.dept = dept;
	}

	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}
	
	
}
