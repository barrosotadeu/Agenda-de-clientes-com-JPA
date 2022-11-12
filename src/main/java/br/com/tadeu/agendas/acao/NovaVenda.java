package br.com.tadeu.agendas.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovaVenda implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		String idParam = request.getParameter("id");
		request.setAttribute("id", idParam);
		return "forward:formCadastraVenda.jsp";
	}

}
