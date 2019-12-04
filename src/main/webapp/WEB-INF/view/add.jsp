<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>
	    <h1>添加页面</h1>
	    <form:form action="add" method="post" modelAttribute="house">
	      店铺名称:<form:input path="hname"/><br><br>
	      创建日期:<form:input path="datea"/><br><br>
	      销售商品:<c:forEach items="${shoping}" var="s" varStatus="i">
	         <form:checkbox path="shopings[${i.index}].sid" value="${s.sid}" label="${s.sname}"/>
	      </c:forEach><br><br>
	      <input type="submit" value="保存">
	    </form:form>
</body>
</html>