package fr.igacha;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.igacha.persistence.ActionARealiser;
import fr.igacha.persistence.Caracteristique;
import fr.igacha.persistence.Classe;
import fr.igacha.persistence.Personnage;
import fr.igacha.persistence.Quete;
import fr.igacha.persistence.Scenario;

public class Test1 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("model-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		/*
		 * déja ds la base Caracteristique sauter = new
		 * Caracteristique("sauter",5); Caracteristique courir = new
		 * Caracteristique("courir",6);
		 * Personnage alex = new Personnage("alexandre", "le mage", 25);
		 */
		Classe voleur = new Classe("Voleur");
		
		//Classe voleur = (Classe)entityManager.createQuery("from Classe").getResultList().get(0);
		 
		// Classe chasseur =(Classe) entityManager.createQuery("from
		// Classe").getResultList().get(1);

		// ActionARealiser tuer =
		// (ActionARealiser)entityManager.createQuery("ActionARealiser").getResultList().get(0);

		// Quete chateau = (Quete)entityManager.createQuery("from
		// Quete").getResultList().get(0);

		// Scenario gentil = (Scenario)entityManager.createQuery("from
		// Scenario").getResultList().get(0);

		

		entityManager.getTransaction().begin();
		// entityManager.persist(voleur);
		// entityManager.persist(chasseur);
		/*
		 * déjà dans la base entityManager.persist(sauter);
		 * entityManager.persist(courir);
		 * entityManager.persist(alex);
		 */
		entityManager.persist(voleur);

		// entityManager.persist(tuer);
		// entityManager.persist(chateau);

		// entityManager.persist(gentil);
		
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

	}

}
