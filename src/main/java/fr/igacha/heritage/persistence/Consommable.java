package fr.igacha.heritage.persistence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cons")
public class Consommable extends Objet {

	
	private String buvable;
	
	private String mangeable;
	
	private int duree;

	public Consommable() {
	}
}
