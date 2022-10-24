package br.com.tadeu.agendas.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.agendas.controller.ClienteDAO;
import br.com.tadeu.agendas.controller.JPAUltil;
import br.com.tadeu.agendas.modelo.Cliente;

public class AlteraCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		ClienteDAO dao = new ClienteDAO(JPAUltil.getEntityManager());
		
		Integer id = Integer.valueOf(request.getParameter("id"));		
		Cliente cliente = dao.buscaClientePorId(id);
		
		cliente.setNome(request.getParameter("nome"));
		cliente.setCpf(request.getParameter("cpf"));
		cliente.setTelefone(request.getParameter("telefone"));
		cliente.setEmail(request.getParameter("email"));
		
		dao.alteraCliente(cliente);
		
		return "redirect:entrada?acao=ListaClientes";
	}

}
