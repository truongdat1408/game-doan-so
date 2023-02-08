<%--
  Created by IntelliJ IDEA.
  User: truong
  Date: 06/02/2023
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>GAME DOAN SO - PLAYING GAME</title>
</head>
<body>
    Hello ${sessionScope.username} - ID: ${sessionScope.userId}
    <form>
        <div class="form-group">
            <label>Đoán số (0-1000)</label>
            <input type="text" name="number" id="numberValue">
        </div>
        <button id="guess-btn" type="submit">OK</button>
    </form>
    <p id="suggestion">Suggestion: </p>

    <script src="js/game.js"></script>
</body>
</html>
