<%@ page import="java.util.List" %>
<%@ page import="your.package.SysUser" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<h2>User List</h2>
<%
    List<SysUser> users = (List<SysUser>)request.getAttribute("users");
    if (users != null && !users.isEmpty()) {
        for (SysUser user : users) {
            out.println("<p>" + user.getUserName() + " - " + user.getEmail() + "</p>");
        }
    } else {
        out.println("<p>No users found.</p>");
    }
%>
</body>
</html>
