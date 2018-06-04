package br.una.veiculos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cidade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		
	Integer id;
	String Name;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="estado_id")
	private Estado Estado;
	
	public Cidade() {
		
	}

	public Cidade(Integer id, String name,Integer id_state) {
		super();
		this.id = id;
		this.Name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}



	
}

