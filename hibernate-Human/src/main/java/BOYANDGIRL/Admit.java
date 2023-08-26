package BOYANDGIRL;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Admit {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Girl g1 = new Girl();
		g1.setName("Tamanna");
		
		Boy b1 = new Boy();
		b1.setName("Siva");
		b1.setG(g1);
		
		Boy b2 = new Boy();
		b2.setName("Ranveer");
		b2.setG(g1);
		
		Boy b3 = new Boy();
		b3.setName("Venky");
		b3.setG(g1);
		
		Boy b = new Boy();
		b.setName("Avinash");
		b.setG(g1);
		
		Boy b4 = new Boy();
		b4.setName("Prakash Raj");
		b4.setG(g1);
		
		List<Boy> boyfriends=new ArrayList<>();
		boyfriends.add(b);
		boyfriends.add(b1);
		boyfriends.add(b2);
		boyfriends.add(b3);
		
		g1.setBoyfriends(boyfriends);
		
		et.begin();
			em.persist(g1);
			
//			em.persist(b1);
//			em.persist(b2);
//			em.persist(b3);
//			em.persist(b);
//			em.persist(b4);
//			
			
		et.commit();
		
	}

}
