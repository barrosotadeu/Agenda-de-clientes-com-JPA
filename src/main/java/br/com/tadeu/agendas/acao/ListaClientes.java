package br.com.tadeu.agendas.acao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.agendas.controller.ClienteDAO;
import br.com.tadeu.agendas.controller.JPAUltil;
import br.com.tadeu.agendas.modelo.Cliente;

public class ListaClientes implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		ClienteDAO dao = new ClienteDAO(JPAUltil.getEntityManager());
		List<Cliente> clientes = dao.listaClientes();
		request.setAttribute("clientes", clientes);
		
		return "forward:listaClientes.jsp";
	}

}
