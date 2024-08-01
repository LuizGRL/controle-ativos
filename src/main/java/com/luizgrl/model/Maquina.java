package com.luizgrl.model;
import javax.persistence.*;
import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Maquina")
public class Maquina implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty(message = "Esse campo não pode ser vazio")	
	@Column(nullable = false)
	private String hostname;
	@Column(nullable = false)
	@NotEmpty(message = "Esse campo não pode ser vazio")	
	private String descricao;
	@Column(nullable = false)
	@NotEmpty(message = "Esse campo não pode ser vazio")	
	private String processador;
	@Column(nullable = false)
	@NotNull(message = "Esse campo não pode ser vazio")	
	private float quantidadeMemoria;
	@Column(nullable = false)
	@NotNull(message = "Esse campo não pode ser vazio")	
	private float quantidadeArmazenamento;
	@Column(nullable = false)
	@NotNull(message = "Esse campo não pode ser vazio")	
	private boolean emUso;

	public Maquina() {
		
	}
	
	public long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getHostname() {
		return hostname;
	}


	public void setHostname(String hostname) {
		this.hostname = hostname;
	}


	public String getProcessador() {
		return processador;
	}


	public void setProcessador(String processador) {
		this.processador = processador;
	}


	public float getQuantidadeMemoria() {
		return quantidadeMemoria;
	}


	public void setQuantidadeMemoria(float quantidadeMemoria) {
		this.quantidadeMemoria = quantidadeMemoria;
	}


	public float getQuantidadeArmazenamento() {
		return quantidadeArmazenamento;
	}


	public void setQuantidadeArmazenamento(float quantidadeArmazenamento) {
		this.quantidadeArmazenamento = quantidadeArmazenamento;
	}


	public boolean getEmUso() {
		return emUso;
	}


	public void setEmUso(boolean emUso) {
		this.emUso = emUso;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
