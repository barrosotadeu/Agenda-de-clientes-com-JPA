package br.com.tadeu.agendas.acao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.agendas.controller.ClienteDAO;
import br.com.tadeu.agendas.controller.JPAUltil;
import br.com.tadeu.agendas.dto.ContatosDoClienteDTO;

public class MostraClientesEContato implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		ClienteDAO clienteDAO = new ClienteDAO(JPAUltil.getEntityManager());
		
		List<ContatosDoClienteDTO> lista = clienteDAO.mostraClientesEContatos();
		
		request.setAttribute("lista", lista);
		return "forward:mostraClientesEContatos.jsp";
	}

}
