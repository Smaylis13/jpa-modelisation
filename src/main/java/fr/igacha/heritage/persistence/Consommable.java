package fr.igacha.heritage.persistence;

import javax.persistence.Entity;

@Entity
public class Consommable extends Objet {

	
	private String buvable;
	
	private String mangeable;
	
	private int duree;

	public Consommable() {
	}
}
