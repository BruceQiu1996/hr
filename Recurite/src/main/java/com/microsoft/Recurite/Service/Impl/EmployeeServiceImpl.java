package com.microsoft.Recurite.Service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.microsoft.Recurite.Entity.EmployeeEntity;
import com.microsoft.Recurite.Mapper.EmployeeMapper;
import com.microsoft.Recurite.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private static final Logger LOGGER = LogManager.getLogger(EmployeeService.class);
	
	@Resource
	private EmployeeMapper employeeMapper;
	@Override
	public List<EmployeeEntity> SelAllEmployee() {
		try {
			return employeeMapper.SelAllEmployee();
		}catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		return null;
	}
	
}
