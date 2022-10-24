package br.com.tadeu.agendas.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.agendas.controller.ClienteDAO;
import br.com.tadeu.agendas.controller.JPAUltil;

public class DeletaCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		String idParam = request.getParameter("id");
		Integer id = Integer.valueOf(idParam);
		
		ClienteDAO dao = new ClienteDAO(JPAUltil.getEntityManager());
		dao.deletaCliente(dao.buscaClientePorId(id));
		
		return "redirect:entrada?acao=ListaClientes";
	}

}
