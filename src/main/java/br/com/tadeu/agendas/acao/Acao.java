package br.com.tadeu.agendas.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response);
}
