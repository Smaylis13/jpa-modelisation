package fr.igacha.persistence;

import java.util.List;

import javax.persistence.*;

@Entity
public class Personnage {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@Column
	private int age;
	
	@OneToMany(mappedBy="personnage")
	private List<Scenario> scenarios;
	
	@OneToMany(mappedBy="personnage")
	private List<Classe> classes;
	
	@ManyToMany(mappedBy="personnages")
	private List<Caracteristique> caracteristiques;
	
	public Personnage() {
	}

	public Personnage(String pName, String pPrenom, int pAge) {
		this.nom = pName;
		this.prenom = pPrenom;
		this.age = pAge;
	}
}
