<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.Password" %>
<%
// リクエストスコープに保存された Password インスタンスを取得する
Password password = (Password) request.getAttribute("password");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>パスワード生成</title>
</head>
<body>
<h1>パスワード生成結果</h1>
<p>
パスワード：<br>
<%
String[] outputPasswordStringArray = password.getPasswordStringArray();
int iLength = Integer.parseInt(password.getNumberOfPassword());
	for (int i = 0; i < iLength; i++){
		out.println(outputPasswordStringArray[i] + "<br>");
	}
%>
</p>
<a href="/randomPasswordGenerator/PasswordGenerate">戻る</a>
</body>
</html>
