package ElectionParties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStateAndCM {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		State s= em.find(State.class, 3);
		
		CM cm =s.getCm();
		
		et.begin();
		em.remove(s);
		em.remove(cm);
		et.commit();
	}

}
