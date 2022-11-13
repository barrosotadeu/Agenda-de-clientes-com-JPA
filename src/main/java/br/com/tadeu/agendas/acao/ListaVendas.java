package br.com.tadeu.agendas.acao;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.agendas.controller.ClienteDAO;
import br.com.tadeu.agendas.controller.JPAUltil;
import br.com.tadeu.agendas.controller.VendaDAO;
import br.com.tadeu.agendas.modelo.Cliente;

public class ListaVendas implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		ClienteDAO clienteDAO = new ClienteDAO(JPAUltil.getEntityManager());
		VendaDAO vendaDAO = new VendaDAO(JPAUltil.getEntityManager());
		
		
		Cliente cliente = clienteDAO.buscaClientePorId(Integer.valueOf(request.getParameter("id")));
		BigDecimal valorTotal = vendaDAO.retornaTotalDeVendasPorCliente(cliente);
		//BigDecimal valorTotal = vendaDAO.retornaTotalDeVendasPorCliente(cliente);
		System.out.println(cliente);
		//System.out.println(soma);
		
		request.setAttribute("vendas", cliente.getVendas());
		request.setAttribute("valorTotal", valorTotal);
		
		return "forward:listaVendas.jsp";
	}

}
