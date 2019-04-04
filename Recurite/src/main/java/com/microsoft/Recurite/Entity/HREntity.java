package com.microsoft.Recurite.Entity;

import java.util.Date;

public class HREntity {
	private String hr_name;
	private String hr_username;
	private String password;
	private String heagimg;
	private Date birthday;
	public String getHr_name() {
		return hr_name;
	}
	public void setHr_name(String hr_name) {
		this.hr_name = hr_name;
	}
	public String getHr_username() {
		return hr_username;
	}
	public void setHr_username(String hr_username) {
		this.hr_username = hr_username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHeadimg() {
		return heagimg;
	}
	public void setHeadimg(String headimg) {
		this.heagimg = headimg;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
