package Player;

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

	
		

		Video v2 = new Video();
		v2.setVid(101);
		v2.setTitle("Learn Java");
		v2.setDuration(160);
		v2.setP(p1);
		

		
		
		et.begin();
		em.merge(p1);
		em.merge(v2);
		et.commit();
		
	}

}
