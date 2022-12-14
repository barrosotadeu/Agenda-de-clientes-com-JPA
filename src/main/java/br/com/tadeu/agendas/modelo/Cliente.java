package br.com.tadeu.agendas.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Venda> vendas = new ArrayList<Venda>();
	
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf, String telefone, String email) {		
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Integer getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void adicionaVenda(Venda venda) {
		this.vendas.add(venda);
	}
	
	public List<Venda> getVendas() {
		return vendas;
	}
	
	
	

}
