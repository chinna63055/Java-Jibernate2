package ElectionParties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStateCM {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		State s = new State();
		s.setNo(6);
		s.setName("odisha");
		s.setCapital("Bhubaneswar");
		
		CM cm = new CM();
		cm.setName("Sri Naveen");
		cm.setAge(60);
		cm.setQualification("political");
		
		s.setCm(cm);
		cm.setS(s);
		
		et.begin();
		em.persist(cm);
		em.persist(s);
		et.commit();
	}

}
