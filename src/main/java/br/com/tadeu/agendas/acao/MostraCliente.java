package br.com.tadeu.agendas.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.agendas.controller.ClienteDAO;
import br.com.tadeu.agendas.controller.JPAUltil;
import br.com.tadeu.agendas.modelo.Cliente;

public class MostraCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		Integer id = Integer.valueOf(request.getParameter("id"));
		Cliente cliente = new ClienteDAO(JPAUltil.getEntityManager()).buscaClientePorId(id);
		request.setAttribute("cliente", cliente);
		return "forward:mostraCliente.jsp";
	}

}
