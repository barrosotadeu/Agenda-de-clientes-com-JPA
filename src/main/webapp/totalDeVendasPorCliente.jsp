<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Total de vendas por cliente</title>
</head>
<body>
	<ul>
		<c:forEach items="${totalDeVendas}" var="nomeETotal">
			<li>${nomeETotal}</li>
		</c:forEach>
	</ul>

</body>
</html>