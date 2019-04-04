package com.microsoft.Recurite.viewModel;

public class ReturnTemplateViewModel {
	private boolean success;
	private String message;
	private int code;
	private Object data;
	public ReturnTemplateViewModel() {}
	
	public ReturnTemplateViewModel(boolean success, String message, int code, Object data) {
		super();
		this.success = success;
		this.message = message;
		this.code = code;
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
 
