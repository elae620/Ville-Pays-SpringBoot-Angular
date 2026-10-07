package com.elae.ville.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Ville {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVille;
	private String nomVille;
	private Double superficie;
	private Date dateCreation;
	@ManyToOne
	private Pays pays;
	
	
	public Ville(Long idVille, String nomVille, Double superficie, Date dateCreation) {
		super();
		this.idVille = idVille;
		this.nomVille = nomVille;
		this.superficie = superficie;
		this.dateCreation = dateCreation;
	}
	
	
	
	public Ville(String nomVille, Double superficie, Date dateCreation) {
		super();
		this.nomVille = nomVille;
		this.superficie = superficie;
		this.dateCreation = dateCreation;
	}






	@Override
	public String toString() {
		return "Ville [idVille=" + idVille + ", nomVille=" + nomVille + ", superficie=" + superficie + ", dateCreation="
				+ dateCreation + "]";
	}

	public Long getIdVille() {
		return idVille;
	}


	public void setIdVille(Long idVille) {
		this.idVille = idVille;
	}


	public String getNomVille() {
		return nomVille;
	}


	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}


	public Double getSuperficie() {
		return superficie;
	}


	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}



	public Pays getPays() {
		return pays;
	}



	public void setPays(Pays pays) {
		this.pays = pays;
	}
	
  
}
