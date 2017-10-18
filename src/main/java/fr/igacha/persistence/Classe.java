package fr.igacha.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Classe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nom;
	
	@ManyToOne
	@JoinColumn(name="id_personnage")
	private Personnage personnage;
	public Classe() {
	}
	public Classe(String pName) {
		this.nom = pName;
	}
}
