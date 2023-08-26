package HMan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonTest {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bus b = new Bus();
		b.setBid(1);
		b.setNumber("ahgf");
		b.setType("iii");
		
		et.begin();
		em.persist(b);
		et.commit();
		
	}

}
