package com.generation.games.Generation.Games.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 2, max = 50)
	private String nome;
	
	@NotNull
	@Size(min = 10, max = 50)
	private String produtora;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date DataLancamento = new java.sql.Date(System.currentTimeMillis());
	
	private String categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public Date getDataLancamento() {
		return DataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		DataLancamento = dataLancamento;
	}
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}	
}
