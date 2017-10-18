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
public class Scenario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nom;
	
	@ManyToOne
	@JoinColumn(name="id_personnage")
	private Personnage personnage;
	
	@ManyToMany
	@JoinTable(name = "quete_scenario", 
			joinColumns = @JoinColumn(name = "ID_SCENARIO", referencedColumnName = "ID"), 
			inverseJoinColumns = @JoinColumn(name = "ID_QUETE", referencedColumnName = "ID")
	)
	private List<Quete> quetes; 
	
	public Scenario() {
	}
}
