package fr.igacha.heritage.persistence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("ARM")
public class Arme extends Objet {

	
	private int valeurAttaque;
	
	public Arme() {
	}
}
