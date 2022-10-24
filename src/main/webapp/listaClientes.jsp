<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<title>Agenda</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Nome</th>
				<th>CPF</th>
				<th>Telefone</th>
				<th>email</th>	
				<th>Opções</th>			
			</tr>			
		</thead>
		<tbody>
		<c:forEach items="${clientes}" var="cliente" >
			<tr>
				<td>${cliente.nome}</td>
				<td>${cliente.cpf}</td>
				<td>${cliente.telefone}</td>
				<td>${cliente.email}</td>
				<td><a href="#" class="botao botao-editar">editar</a><a  href="entrada?acao=DeletaCliente&id=${cliente.id}" class="botao botao-deletar">deletar</a></td>
				
			</tr>
		</c:forEach>
		</tbody>
	</table>

</body>
</html>