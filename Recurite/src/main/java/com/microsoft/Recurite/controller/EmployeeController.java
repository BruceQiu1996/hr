package com.microsoft.Recurite.controller;



import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microsoft.Recurite.Entity.HREntity;
import com.microsoft.Recurite.Service.HrService;
import com.microsoft.Recurite.util.SMSUtil.TokenProccessor;
import com.microsoft.Recurite.viewModel.LoginCountViewModel;
import com.microsoft.Recurite.viewModel.LoginData;
import com.microsoft.Recurite.viewModel.LoginUserViewModel;
import com.microsoft.Recurite.viewModel.ReturnTemplateViewModel;


import io.swagger.annotations.Api;

@Controller
@EnableAutoConfiguration
@Api
public class EmployeeController {
	private static AtomicInteger loginNumber=new AtomicInteger(0);
	
	@Resource
	private HrService hrService;
	
	@GetMapping("HR/login")
	@ResponseBody
	public ReturnTemplateViewModel showAllEmployee(LoginUserViewModel user,HttpServletRequest request){
//		if(capture.equals(user.getCaptcha())) {
			HREntity hrEntity=null;
			List<HREntity> list=hrService.SelAllHr();
			for(HREntity entitys:list) {
				if(entitys.getHr_username().equals(user.getUserName())){
					hrEntity=entitys;
					break;
				}
			}
			if(hrEntity==null) {
				return new ReturnTemplateViewModel(false,"用户名不存在",500,new LoginData(false,"用户名不存在",null,null,null));
			}else {
				if(hrEntity.getPassword().equals(user.getPassword())) {
					loginNumber.getAndIncrement();
					String token=TokenProccessor.getInstance().makeToken();
					request.getSession().setAttribute("userToken", token);
					return new ReturnTemplateViewModel(true,"登陆成功",200,new LoginData(true,"登陆成功",token,user.getUserName(),hrEntity.getHr_name()));
				}else {
					return new ReturnTemplateViewModel(false,"密码错误",500,new LoginData(false,"密码错误",null,null,null));
				}
			}
//		}else {
//			return new ReturnTemplateViewModel(false,"验证码错误",500,new LoginData(false,"验证码错误",null,null,null));
//		}
	}
	@GetMapping("HR/getLoginInfo")
	@ResponseBody
	public LoginCountViewModel showLoginInfo(HttpServletRequest request) {
		System.out.println("123");
		List<HREntity> list=hrService.SelAllHr();
		LoginCountViewModel loginCountViewModel=new LoginCountViewModel((int)request.getSession().getServletContext().getAttribute("onlineNumber"), loginNumber.get(), list.size());
		return loginCountViewModel;
	}
}
