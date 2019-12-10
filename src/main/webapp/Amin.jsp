<%--
  Created by IntelliJ IDEA.
  User: Mark
  Date: 10.12.2019
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<h1 align="center">Панель администратора</h1>
<div class="albert" align="center">
    <form action="add" method="post">
        <table>
            <tr><td><input type="text" name = "minSum" placeholder="Мин. сумма займа"/></td></tr>
            <tr><td><input type="text" name = "maxSum"placeholder="Макс. сумма займа"/></td></tr>
            <tr><td><input type="text" name = "minMonth"placeholder="Мин. длит-ть займа"/></td></tr>
            <tr><td><input type="text" name = "maxMonth"placeholder="Макс. длит-ть займа"/></td></tr>
            <tr><td><input type="text" name = "intRate"placeholder="Годовая % ставка"/></td></tr>
            <tr><td><input type="submit" value="Применить" class="submit"></td></tr>
        </table>
    </form> </div>
</body>
</html>
