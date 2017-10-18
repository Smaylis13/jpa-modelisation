package fr.igacha.heritage.persistence;

import javax.persistence.Entity;

@Entity
public class ElementArmure extends Objet {

	private String emplacement;
	
	private int valeurDefense;
	
	public ElementArmure() {
	}
}
