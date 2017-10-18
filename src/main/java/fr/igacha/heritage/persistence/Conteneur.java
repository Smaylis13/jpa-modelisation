package fr.igacha.heritage.persistence;

import java.util.List;

import javax.persistence.*;

@Entity
public class Conteneur {

	@Id
	private int id;
	
	@OneToMany(mappedBy="conteneur")
	private List<Objet> objets;
	
	@Column
	private String nom;
	
	@Column
	private String type;
	
	@Column
	private int nbObjetsMax;
}
