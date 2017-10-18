package fr.igacha.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ActionARealiser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String type;
	
	@Column
	private String cible;
	
	@Column
	private double coordX;
	
	@Column
	private double coordY;
	
	@ManyToOne
	@JoinColumn(name="id_actionARealisers")
	private Quete quete;
	
	public ActionARealiser() {
	}
}
