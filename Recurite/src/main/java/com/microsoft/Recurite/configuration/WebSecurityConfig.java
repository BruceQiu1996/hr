package com.microsoft.Recurite.configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.microsoft.Recurite.constant.GlobalConst;

public class WebSecurityConfig extends WebMvcConfigurerAdapter{
	@Bean
	public SecurityInterceptor getSecurityInterceptor() {
		return new SecurityInterceptor();
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		InterceptorRegistration addInterceptorRegistration=registry.addInterceptor(getSecurityInterceptor());
//		addInterceptorRegistration.addPathPatterns("");
//		addInterceptorRegistration.addPathPatterns("/");
//		addInterceptorRegistration.addPathPatterns("/user/info");
//		addInterceptorRegistration.addPathPatterns("/user/resume");
//
//		addInterceptorRegistration.addPathPatterns("#");
//		addInterceptorRegistration.addPathPatterns("/user/info#");
//		addInterceptorRegistration.addPathPatterns("/user/resume#");
	}
	/***
	 * 
	 * @author sumuth
	 *
	 */
	public class SecurityInterceptor extends HandlerInterceptorAdapter{
		@Override
		public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler)throws Exception {
			HttpSession session=request.getSession();
			if(session.getAttribute(GlobalConst.SESSION_KEY)!=null) {
				return true;
			}
			response.sendRedirect("/login");
			return false;
		}
		@Override
		public void afterCompletion(
	                HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
	                throws Exception {
	            HttpSession session = request.getSession();
	            if (session.getAttribute(GlobalConst.SESSION_KEY) == null) {
	                response.sendRedirect("/login");
	            }
	    }
	}
}
