package model;

import java.io.Serializable;

public class Password implements Serializable {
	private String passwordString;

	public Password() {
	}

	public Password(String passwordString) {
		this.passwordString = passwordString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	public String getPasswordString() {
		return this.passwordString;
	}
}
