package com.microsoft.Recurite.Service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.microsoft.Recurite.Entity.HREntity;
import com.microsoft.Recurite.Mapper.HRMapper;
import com.microsoft.Recurite.Service.HrService;


@Service
public class HrServiceImpl implements HrService{
	private static final Logger LOGGER = LogManager.getLogger(HrServiceImpl.class);
	
	@Resource
	private HRMapper hrMapper;
	@Override
	public List<HREntity> SelAllHr() {
		try {
			return hrMapper.SelAllHr();
		}catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		return null;
	}
}