package fr.igacha.persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Quete {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String nom;
	
	@Column
	private int delai;
	
	@Column
	private double debutCoordX;

	@Column
	private double debutCoordY;
	
	@ManyToMany(mappedBy="quetes")
	private List<Scenario> scenarios;
	
	@OneToMany(mappedBy="quete")
	private List<ActionARealiser> actionARealisers;

	public Quete() {
	}
}
