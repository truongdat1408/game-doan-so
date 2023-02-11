<%--
  Created by IntelliJ IDEA.
  User: truon
  Date: 06/02/2023
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GAME DOAN SO - Charts</title>
</head>
<body>
    <div>
        <p2>Bảng Xếp Hạng</p2>
        <%! int count = 1; %>
        <c:forEach items="${users}" var="user" begin="0" end="5">
            <div>
                <p>${count}. ${user.getId()} - ${user.getName()}</p>
                <% count = count + 1; %>
            </div>
        </c:forEach>
    </div>
    <div>
        <button id="btn-reset">Reset BXH</button>
        <button id="btn-play">Chơi mới</button>
    </div>
    <script type="text/javascript" src="js/chart.js"></script>
</body>
</html>
