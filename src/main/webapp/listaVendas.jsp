<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>      
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vendas</title>
</head>
<body>
	<ul>
		<c:forEach items="${vendas}" var="venda">
			<li>${venda}</li>
		</c:forEach>
	</ul>
	
	<p>Total de vendas do cliente: <c:out value="${valorTotal}"></c:out> </p>

</body>
</html>