package model;

import java.io.Serializable;

public class Password implements Serializable {
	private String numberOfPassword;
	private String passwordString;

	public Password() {
	}

	public Password(String passwordString, String numberOfPassword) {
		this.passwordString = passwordString;
		this.numberOfPassword = numberOfPassword;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	public String getPasswordString() {
		return this.passwordString;
	}

	public void setNumberOfPassword(String numberOfPassword) {
		this.numberOfPassword = numberOfPassword;
	}

	public String getNumberOfPassword() {
		return this.numberOfPassword;
	}
}
