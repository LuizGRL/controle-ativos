package com.luizgrl.model;
import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "Maquina")
public class Maquina implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String descricao;
	@Column
	private String nome;
	
	public Maquina() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
