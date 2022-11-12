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
		<label for="nomeProduto">Informe o nome do produto</label>
		<input type="text" name="nomeProduto" id="nomeProduto" placeholder="nome">
		
		<label for="valor">Informe o valor</label>
		<input type="text" name="valor" id="valor" placeholder="valor">
		
		
		
		<input type="hidden" name="acao" value="RegistraVenda">
		<input type="hidden" name="id" value="${id}">
		
		<button type="submit">Cadastrar</button>
	</form>
	


</body>
</html>