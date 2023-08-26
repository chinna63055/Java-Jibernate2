package BUS;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBus {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bus b = new Bus();
		b.setBid(001);
		b.setNumber("AP05 3982");
		b.setType("AC");
		
		Seat s1 = new Seat();
		s1.setSno(5);
		s1.setColor("Sky");
		s1.setB(b);
		
		Seat s2 = new Seat();
		s2.setSno(6);
		s2.setColor("Sky");
		s2.setB(b);
		
		List<Seat> seats=new ArrayList<>();
		seats.add(s1);
		seats.add(s2);
		
		b.setSeats(seats);
		
		
		et.begin();
		em.persist(b);
		em.persist(s1);
		em.persist(s2);
		et.commit();
	}

}
