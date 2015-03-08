<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>今日の晩御飯</title>
</head>
<body>

    <p><h1>今日の晩御飯</h1></p>

    <div>
     <p>${val}</p>
    </div>

    <div>
        <form method="post" action="/save">
            <div>今日は何食べた？：<input type="text" name="name"></div>
            <input type="submit" value="送信">
        </form>
    </div>

    <a href="/list">一覧へ</a>
</body>
</html>