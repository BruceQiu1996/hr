package com.microsoft.Recurite.viewModel;

public class LoginCountViewModel {
	private int onLineCount;
	private int loginCount;
	private int hrCount;
	public LoginCountViewModel(int onLineCount, int loginCount, int hrCount) {
		super();
		this.onLineCount = onLineCount;
		this.loginCount = loginCount;
		this.hrCount = hrCount;
	}
	
}
