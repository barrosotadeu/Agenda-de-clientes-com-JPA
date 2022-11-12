package br.com.tadeu.agendas.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.agendas.acao.Acao;

/**
 * Servlet implementation class Controller
 */

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acaoParam = request.getParameter("acao");
		String nomeDaClasse = "br.com.tadeu.agendas.acao." + acaoParam;
		String nome;
		
		
			try {
				Class classe = Class.forName(nomeDaClasse);
				Acao obj = (Acao) classe.newInstance();
				nome = obj.executa(request, response);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException  e) {
				throw new ServletException(e);
			}
			
			String[] tipoDeEndereco = nome.split(":");
			
			if(tipoDeEndereco[0].equals("forward")) {
				RequestDispatcher rd = request.getRequestDispatcher(tipoDeEndereco[1]);
				rd.forward(request, response);
			} 
			else {
				response.sendRedirect(tipoDeEndereco[1]);
			}
		
			
	
		
		
	}

}
