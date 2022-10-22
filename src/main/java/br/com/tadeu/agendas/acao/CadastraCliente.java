package br.com.tadeu.agendas.acao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.tadeu.agendas.controller.ClienteDAO;
import br.com.tadeu.agendas.controller.JPAUltil;
import br.com.tadeu.agendas.modelo.Cliente;

public class CadastraCliente implements Acao {

	private static final String ClienteDAO = null;

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		
		Cliente cliente = new Cliente(nome, cpf, telefone, email);
		
		ClienteDAO dao = new ClienteDAO(JPAUltil.getEntityManager());
		dao.cadastraCliente(cliente);
		
		return "redirect:entrada?acao=ListaClientes";
	}

}
