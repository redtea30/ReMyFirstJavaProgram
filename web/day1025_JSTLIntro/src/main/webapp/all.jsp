<%--
  Created by IntelliJ IDEA.
  entity.Brand: ASUS
  Date: 2023/10/25
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入jstl核心库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
    <style>
        td {
            width: 150px;
        }
    </style>
</head>
<body>
hello
<%--test 条件 true/false ${条件表达式}--%>
<c:if test="${1 > 2}">
    一大于2
</c:if>
<c:if test="${1 < 2}">
    一小于2
</c:if>

<br>

<%--items 要遍历的对象（容器）--%>
<%--for (Kfmuser u : listList) {}--%>
<table border="1" cellpadding="1">
    <tr>

        <th>count</th>
        <th>username</th>
        <th>password</th>
        <th>email</th>
        <th>operation</th>

    </tr>
    <c:forEach items="${all}" var="user" varStatus="state">
        <%--count 1 开始计数--%>
        <%--index 0 开始计数--%>
        <tr>
                <%--    index: ${state.index}--%>
                <%--state.count 提供了当前变量的信息 哇，能计数 --%>
            <td>${state.count}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>
                <c:if test="${user.email == null}">
                    暂无
                </c:if>
                <c:if test="${user.email != null}">
                    ${user.email}
                </c:if>
            </td>
            <td>
                <a href="">修改</a>
                <a href="/remove?username=${user.username}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
