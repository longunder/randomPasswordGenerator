package model;

import java.io.Serializable;

public class Password implements Serializable {
	private String numberOfPassword;
	private String[] passwordStringArray;

	public Password() {
	}

	public Password(String[] passwordStringArray, String numberOfPassword) {
		this.passwordStringArray = passwordStringArray;
		this.numberOfPassword = numberOfPassword;
	}

	public void setPasswordStringArray(String[] passwordStringArray) {
		this.passwordStringArray = passwordStringArray;
	}

	public String[] getPasswordStringArray() {
		return this.passwordStringArray;
	}

	public void setNumberOfPassword(String numberOfPassword) {
		this.numberOfPassword = numberOfPassword;
	}

	public String getNumberOfPassword() {
		return this.numberOfPassword;
	}
}
