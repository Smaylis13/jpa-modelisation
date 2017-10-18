package fr.igacha.heritage.persistence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ELEMARM")
public class ElementArmure extends Objet {

	private String emplacement;
	
	private int valeurDefense;
	
	public ElementArmure() {
	}
}
