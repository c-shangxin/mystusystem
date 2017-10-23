package com.empsystem.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.empsystem.entity.TbEmp;
import com.empsystem.service.IDeptService;
import com.empsystem.service.IEmpService;
import com.opensymphony.xwork2.ActionContext;

@Controller("empAction")
@Scope("prototype")
public class EmpAction {
	
	private TbEmp emp;
	
	@Resource(name="deptService")
	private IDeptService deptService;
	@Resource(name="empService")
	private IEmpService empService;
	
	//去到添加员工的方法
	public String toAddEmp(){
		List deptList=deptService.findDeptList();
		ActionContext.getContext().put("deptList", deptList);
		return "addEmp";
	}
	
	//添加员工
	public String addEmp(){
		empService.addEmp(emp);
		return "toAddEmp";
	}
	
	//查询员工
	public String findEmps(){
		List empList=empService.findEmpList();
		ActionContext.getContext().put("empList", empList);
		return "empList";
	}
	//查询出部门再跳转到修改页面
	public String toupdateEmp(){
		List deptList=deptService.findDeptList();
		emp = empService.findEmpById(emp.getEno());
		ActionContext.getContext().put("deptList", deptList);
		ActionContext.getContext().put("empList", empService.findEmpList());
		return "toupdateEmp";
	}
	//调用方法执行修改
	public String doupdateEmp(){
		if(empService.updateEmp(emp)){
			System.out.println("----------------------成功--------------------");
		}else{
			System.out.println("----------------------失败--------------------");
		}
		return "doupdateEmp";
	}
	//删除
	public String dodeleteEmp(){
		//调用Service方法
		if(empService.deleteEmp(emp)){
			System.out.println("SUSEES");
		}else{
			System.out.println("FAILS");
		}
		return "deleteEmp";
	}
	
	
	
	
	
	
	public TbEmp getEmp() {
		return emp;
	}

	public void setEmp(TbEmp emp) {
		this.emp = emp;
	}

	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}

	public void setEmpService(IEmpService empService) {
		this.empService = empService;
	}
	
}







