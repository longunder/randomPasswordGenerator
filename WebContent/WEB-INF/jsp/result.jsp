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
パスワード：<%= password.getPasswordString() %><br>
</p>
<a href="/randomPasswordGenerator/PasswordGenerate">戻る</a>
</body>
</html>
