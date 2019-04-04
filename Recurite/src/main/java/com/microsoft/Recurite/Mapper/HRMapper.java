package com.microsoft.Recurite.Mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;

import com.microsoft.Recurite.Entity.HREntity;

public interface HRMapper {
	@Select("select * from HRM_hr")
	ArrayList<HREntity> SelAllHr();
}
