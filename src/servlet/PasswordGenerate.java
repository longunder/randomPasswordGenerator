package servlet;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Password;
import model.PasswordGenerateLogic;

@WebServlet("/PasswordGenerate")
public class PasswordGenerate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// フォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータを取得する
		String numberOfPassword = request.getParameter("numberOfPassword");

		// 入力値をプロパティに設定する
		Password password = new Password();
		password.setNumberOfPassword(numberOfPassword);

		// パスワードの文字列を作成する
		PasswordGenerateLogic passwordGenerateLogic = new PasswordGenerateLogic();
		try {
			// ランダムな英数字をパスワードに設定する
			passwordGenerateLogic.execute(password);
			// リクエストスコープに保存する
			request.setAttribute("password", password);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		// フォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
		dispatcher.forward(request, response);
	}
}
