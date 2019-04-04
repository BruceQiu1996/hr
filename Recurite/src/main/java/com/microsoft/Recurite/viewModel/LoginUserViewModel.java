package com.microsoft.Recurite.viewModel;

public class LoginUserViewModel {
	private String UserName;
	private String Password;
	private String Captcha;
	private String CaptchaKey;
	public String getCaptchaKey() {
		return CaptchaKey;
	}
	public void setCaptchaKey(String captchaKey) {
		CaptchaKey = captchaKey;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getCaptcha() {
		return Captcha;
	}
	public void setCaptcha(String captcha) {
		Captcha = captcha;
	}
	
}
