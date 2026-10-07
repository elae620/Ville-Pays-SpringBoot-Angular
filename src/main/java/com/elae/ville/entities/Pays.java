package com.elae.ville.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPays;

    private String nomPays;
    private String description;
    
    @JsonIgnore
    @OneToMany(mappedBy = "pays")
    private List<Ville> villes;
    
   

	public Pays(Long idPays, String nomPays, String description, List<Ville> villes) {
		super();
		this.idPays = idPays;
		this.nomPays = nomPays;
		this.description = description;
		this.villes = villes;
	}

	public Pays(String nomPays, String description, List<Ville> villes) {
		super();
		this.nomPays = nomPays;
		this.description = description;
		this.villes = villes;
	}
    
	public Pays() {
		super();
	}

	public Long getIdPays() {
		return idPays;
	}

	public void setIdPays(Long idPays) {
		this.idPays = idPays;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	
	
    

}
