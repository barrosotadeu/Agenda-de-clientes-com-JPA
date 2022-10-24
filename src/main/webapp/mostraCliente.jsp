<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda</title>

</head>
<body>
	<form action="entrada" method="POST">
		<label for="nome">Nome</label>
		<input type="text" name="nome" id="nome" value="${cliente.nome}">
		
		<label for="cpf">CPF</label>
		<input type="text" name="cpf" id="cpf" value="${cliente.cpf}">
		
		<label for="telefone">Telefone</label>
		<input type="text" name="telefone" id="telefone" value="${cliente.telefone}">
		
		<label for="nome">Email</label>
		<input type="text" name="email" id="email" value="${cliente.email}">
		
		<input type="hidden" name="id" value="${cliente.id}">
		
		<input type="hidden" name="acao" value="AlteraCliente">
		<button type="submit">Confirmar</button>
	</form>

</body>
</html>