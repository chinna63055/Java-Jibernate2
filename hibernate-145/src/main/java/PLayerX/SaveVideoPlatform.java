package PLayerX;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SaveVideoPlatform {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Platform p1 = new Platform();
		p1.setId(201);
		p1.setName("Youtube");

		Platform p2 = new Platform();
		p2.setId(202);
		p2.setName("Videocon");
		
		Platform p3 = new Platform();
		p3.setId(203);
		p3.setName("MX-Player");
		
		Video v1 = new Video();
		v1.setVid(101);
		v1.setTitle("LearnJava");
		v1.setDuration(10);
		v1.setP(p1);
		

		Video v2 = new Video();
		v2.setVid(102);
		v2.setTitle("Transformers");
		v2.setDuration(12);
		v2.setP(p1);
		

		Video v3 = new Video();
		v3.setVid(101);
		v3.setTitle("Yoga");
		v3.setDuration(14);
		v3.setP(p2);
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.persist(v1);
		em.persist(v2);
		em.persist(v3);
		et.commit();
		
	}

}
