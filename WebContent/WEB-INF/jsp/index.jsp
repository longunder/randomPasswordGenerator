<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>パスワード生成</title>
</head>
<body>
<h1>パスワード生成</h1>
<form action="/randomPasswordGenerator/PasswordGenerate" method="post">
個数：<input type="text" name="numberOfPassword">(100個まで)<br>
<input type="submit" value="生成">
</form>
</body>
</html>
