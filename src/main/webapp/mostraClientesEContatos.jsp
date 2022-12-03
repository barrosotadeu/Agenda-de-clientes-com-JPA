<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clientes e contatos</title>
</head>
<body>
	<ul>
		<c:forEach items="${lista}" var="clienteEContatos">
			<li>Nome: ${clienteEContatos.nome} 
				Id: ${clienteEContatos.id}
				Telefone: ${clienteEContatos.telefone}
				Email: ${clienteEContatos.email} </li>
			
		</c:forEach>
	</ul>

</body>
</html>