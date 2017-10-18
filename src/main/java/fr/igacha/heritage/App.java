package fr.igacha.heritage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.igacha.heritage.persistence.Arme;


public class App {

	public static void main(String[] args) {
		
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("heritage-jpa");
        EntityManager em = emf.createEntityManager();
        
        Arme o = new Arme();
        EntityTransaction transac = em.getTransaction();
        
        transac.begin();
        em.persist(o);
        transac.commit();
        
        em.close();
        emf.close();
	}

}
