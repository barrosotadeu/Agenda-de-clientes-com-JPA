package br.com.tadeu.agendas.acao;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.agendas.controller.ClienteDAO;
import br.com.tadeu.agendas.controller.JPAUltil;
import br.com.tadeu.agendas.controller.VendaDAO;
import br.com.tadeu.agendas.modelo.Cliente;
import br.com.tadeu.agendas.modelo.Venda;

public class RegistraVenda implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		ClienteDAO clienteDAO = new ClienteDAO(JPAUltil.getEntityManager());
		VendaDAO vendaDAO = new VendaDAO(JPAUltil.getEntityManager());
		
		String idParam = request.getParameter("id");
		Integer id = Integer.valueOf(idParam);
		
		Cliente cliente = clienteDAO.buscaClientePorId(id);
		
		String nomeProduto = request.getParameter("nomeProduto");
		String valorParam = request.getParameter("valor");
		
		System.out.println(valorParam);
		
		BigDecimal valor = new BigDecimal(valorParam);
		
		Venda venda = new Venda(nomeProduto, valor, cliente);
		
		vendaDAO.cadastraVenda(venda);
		
		return "redirect:entrada?acao=ListaClientes";
		
		
		
		
	}

}
