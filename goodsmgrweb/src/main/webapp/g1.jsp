<%--
  Created by IntelliJ IDEA.
  User: Vostro
  Date: 2017/12/15
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@page import="com.lb.architecture1.goodsmgr.Goods1" %>
<%
    System.out.println("in goodsmgrweb g1.jsp");
    new Goods1().good1();
%>
</body>
</html>
