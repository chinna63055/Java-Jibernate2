package STATE;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveState {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
//		EntityTransaction et=Persistence.createEntityManagerFactory("vikas").createEntityManager().getTransaction();
		
		State state1 = new State();
		state1.setNo(1);
		state1.setName("Midin Choudharri");
		state1.setCapital("Kadapa");
		
	}

}
