package model;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PasswordGenerateLogic {
	public static String[] getPasswordStringArray() throws
	NoSuchAlgorithmException {
		// パスワードの長さは32文字にしている
		byte bytes[] = new byte[16];
		// パスワードは100個作成する
		String[] str =new String[100];
		for (int i = 0; i < 100; i++) {
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
			for (int j = 0; j < bytes.length; j++) {
				// byte 型を16進数文字列に変換する
				buf.append(String.format("%02x", bytes[j]));
			}
			str[i] = buf.toString();
		}
		return str;
	}

	public void execute(Password password) throws
	NoSuchAlgorithmException {
		String[] passwordStringArray = getPasswordStringArray();
		password.setPasswordStringArray(passwordStringArray);
		String numberOfPassword = password.getNumberOfPassword();
		password.setNumberOfPassword(numberOfPassword);
	}
}
