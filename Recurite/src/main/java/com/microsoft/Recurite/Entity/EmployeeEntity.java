package com.microsoft.Recurite.Entity;

import java.util.Date;

public class EmployeeEntity {
	 private String emp_id;
	 private String dep_id;
	 private String password;
	 private int emp_type;
	 private String leader_id;
	 private int salary;
	 private String name;
	 private String headimg;
	 private Date jobTimeDate;
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getDep_id() {
		return dep_id;
	}
	public void setDep_id(String dep_id) {
		this.dep_id = dep_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmp_type() {
		return emp_type;
	}
	public void setEmp_type(int emp_type) {
		this.emp_type = emp_type;
	}
	public String getLeader_id() {
		return leader_id;
	}
	public void setLeader_id(String leader_id) {
		this.leader_id = leader_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadimg() {
		return headimg;
	}
	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}
	public Date getJobTimeDate() {
		return jobTimeDate;
	}
	public void setJobTimeDate(Date jobTimeDate) {
		this.jobTimeDate = jobTimeDate;
	}
	 
}
