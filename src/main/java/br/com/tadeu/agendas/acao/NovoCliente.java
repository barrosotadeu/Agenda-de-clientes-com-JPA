package br.com.tadeu.agendas.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovoCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		return "forward:formCadastraCliente.jsp";
	}

}
