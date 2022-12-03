<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Relatorios</title>
</head>
<body>
	<ul>
		<li><a class="link-vendas" href="entrada?acao=TotalDeVendasPorCliente">total de vendas por cliente</a></li>
		<li><a class="link-vendas" href="entrada?acao=MostraClientesEContato">clientes e seus contatos</a></li>
	</ul>

</body>
</html>