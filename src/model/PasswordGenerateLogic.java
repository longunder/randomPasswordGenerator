package model;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PasswordGenerateLogic {
	public static String getPasswordString() throws
	NoSuchAlgorithmException {
		// パスワードの長さは32文字にしている
		byte bytes[] = new byte[16];
		try {
			// 乱数を生成するインスタンスを作成する
			// アルゴリズムは安全性を重視し NativePRNGBlocking を設定している
			SecureRandom secRandom = SecureRandom.getInstance("NativePRNGBlocking");
			// ランダムなバイト配列を取得する
			secRandom.nextBytes(bytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			// byte 型を16進数文字列に変換する
			buf.append(String.format("%02x", bytes[i]));
		}
		String str = buf.toString();
		return str;
	}
	public void execute(Password password) throws
	NoSuchAlgorithmException {
		String passwordString = getPasswordString();
		password.setPasswordString(passwordString);
		String numberOfPassword = password.getNumberOfPassword();
		password.setNumberOfPassword(numberOfPassword);
	}
}
