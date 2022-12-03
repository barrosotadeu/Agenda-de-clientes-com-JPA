package br.com.tadeu.agendas.dto;

public class ContatosDoClienteDTO {
	
	private Integer id;
	private String nome;
	private String telefone;
	private String email;
	
	public ContatosDoClienteDTO(Integer id, String nome, String telefone, String email) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}
	
	

}
