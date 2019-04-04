package com.microsoft.Recurite.Mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;

import com.microsoft.Recurite.Entity.EmployeeEntity;

public interface EmployeeMapper {
	@Select("select * from HRM_Employee")
	ArrayList<EmployeeEntity> SelAllEmployee();
}
