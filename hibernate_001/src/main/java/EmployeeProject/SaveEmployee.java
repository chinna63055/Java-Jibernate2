package EmployeeProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e = new Employee();
		e.setEid(20);
		e.setEname("Sai");
		e.setSal(2000);
		e.setDeptno(1);
		
		et.begin();
		em.persist(e);
		et.commit();
		
	}

}
