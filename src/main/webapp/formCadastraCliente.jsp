<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda</title>
</head>
<body>
	<form action="entrada" method="POST">
		<label for="nome">Informe o nome do cliente</label>
		<input type="text" name="nome" id="nome" placeholder="nome">
		
		<label for="cpf">Informe o cpf do cliente</label>
		<input type="text" name="cpf" id="cpf" placeholder="cpf">
		
		<label for="telefone">Informe o telefone do cliente</label>
		<input type="text" name="telefone" id="telefone" placeholder="telefone">
		
		<label for="nome">Informe o email do cliente</label>
		<input type="text" name="email" id="email" placeholder="email">
		
		<input type="hidden" name="acao" value="CadastraCliente">
		<button type="submit">Cadastrar</button>
	</form>

</body>
</html>