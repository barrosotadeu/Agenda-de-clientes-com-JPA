package br.com.tadeu.agendas.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.agendas.controller.ClienteDAO;
import br.com.tadeu.agendas.controller.JPAUltil;
import br.com.tadeu.agendas.modelo.Cliente;

public class ListaVendas implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		ClienteDAO clienteDAO = new ClienteDAO(JPAUltil.getEntityManager());
		
		Cliente cliente = clienteDAO.buscaClientePorId(Integer.valueOf(request.getParameter("id")));
		
		request.setAttribute("vendas", cliente.getVendas());
		
		return "forward:listaVendas.jsp";
	}

}
