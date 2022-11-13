package br.com.tadeu.agendas.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vendas")
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nome_produto")
	private String nomeProduto;
	private BigDecimal valor;
	@Column(name = "data_venda")
	private LocalDate dataVenda = LocalDate.now();
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	
	
	public Venda(String nomeProduto, BigDecimal valor, Cliente cliente) {
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.cliente = cliente;
	}
	
	public Venda() {
		
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Produto: " + this.nomeProduto + "\n\n"
			  +"Data da venda: " + this.dataVenda + "\n\n"
			  +"Valor: " + this.valor + "\n\n"
			  +"Cliente:" + this.cliente.getNome() + " CPF:" + this.cliente.getCpf()+ "\n\n\n";
	}
	
	
}
