package br.una.veiculos.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Estado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	String Sigla;
	
	@OneToMany(mappedBy="Estado")
	private List<Cidade> Cidades = new ArrayList<>();
	
	public Estado() {
		
	}
	
	public Estado(Long id, String name, String Sigla) {
		this.id = id;
		this.name = name;
		this.Sigla = Sigla;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSigla() {
		return Sigla;
	}

	public void setSigla(String sigla) {
		Sigla = sigla;
	}

	public List<Cidade> getCidade() {
		return getCidade();
	}

	public void setCidade(List<Cidade> cidade) {
		Cidades = cidade;
	}


	
}
