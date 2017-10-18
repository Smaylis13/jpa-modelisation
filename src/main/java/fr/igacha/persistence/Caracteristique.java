package fr.igacha.persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Caracteristique {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String nom;

	@Column
	private int valeur;

	@ManyToMany
	@JoinTable(name = "personnage_caracteristique",
		joinColumns = @JoinColumn(name = "ID_caracteristique", referencedColumnName = "ID"), 
		inverseJoinColumns = @JoinColumn(name = "ID_personnage", referencedColumnName = "ID"))
	private List<Personnage> personnages;

	public Caracteristique() {
	}

	public Caracteristique(String string, int i) {
		// TODO Auto-generated constructor stub
		nom = string;
		valeur = i;
	}
}
