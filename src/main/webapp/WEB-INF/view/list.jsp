<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body> 
	     <form action="list" method="post">
	        店铺名称:<input type="text" value="${hname}" name="hname">
	        <input type="submit" value="查询"> 
	        <input type="button" value="添加" onclick="add()">
	     </form>
	     <table>
	        <tr>
	           <td>ID</td>
	           <td>店铺名称</td>
	           <td>创建日期</td>
	           <td>销货商品</td>
	           <td>操作</td>
	        </tr>
	        <c:forEach items="${info.list}" var="s">
	          <tr>
	             <td>${s.hid}</td>
	             <td>${s.hname}</td>
	             <td>${s.datea}</td>
	             <td>
	               <c:forEach items="${s.shopings}" var="b">
	                 ${b.sname}
	               </c:forEach>
	               
	             </td>
	             <td>
	                <input type="button" value="详情" onclick="look(${s.hid})">
	             </td>
	          </tr>
	        </c:forEach>
	        <tr>
	           <td colspan="10">
	              <a href="list?pageNum=1&hname=${hname}">首页</a>
	              <a href="list?pageNum=${info.prePage}&hname=${hname}">上一页</a>
	              <a href="list?pageNum=${info.nextPage}&hname=${hname}">下一页</a>
	              <a href="list?pageNum=${info.pages}&hname=${hname}">尾页</a>
	           </td>
	        </tr>
	     </table>
</body>
<script type="text/javascript">
  function add() {
	location.href="toAdd";
}
</script>
</html>