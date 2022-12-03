package br.com.tadeu.agendas.acao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.agendas.controller.ClienteDAO;
import br.com.tadeu.agendas.controller.JPAUltil;

public class TotalDeVendasPorCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		ClienteDAO clienteDAO = new ClienteDAO(JPAUltil.getEntityManager());
		List<Object[]> lista = clienteDAO.mostraTotalDeVendasPorCliente();
		List<String> listaComNomeETotalDeVendasComoString = new ArrayList<String>();
		
		for(Object[] arr : lista) {
			String nomeEValorTotal;
			if(arr[1] == null) {
				nomeEValorTotal = "Nome: " + arr[0] + ", " + "Total de vendas: 0.00" ;
			}else {
				nomeEValorTotal = "Nome: " + arr[0] + ", " + "Total de vendas: " + arr[1];
			}
			
			listaComNomeETotalDeVendasComoString.add(nomeEValorTotal);
	}
		
		request.setAttribute("totalDeVendas", listaComNomeETotalDeVendasComoString);
		
		
		return "forward:totalDeVendasPorCliente.jsp";
	}

}
