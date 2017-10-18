package fr.igacha;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.igacha.persistence.Personnage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("model-jpa");
        EntityManager em = emf.createEntityManager();
        Personnage p1 = new Personnage();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        em.persist(p1);
        transac.commit();
        
        em.close();
        emf.close();
    }
}
