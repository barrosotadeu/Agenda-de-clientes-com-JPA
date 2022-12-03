package br.com.tadeu.agendas.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListaRelatorios implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		return "forward:listaRelatorios.jsp";
	}

}
