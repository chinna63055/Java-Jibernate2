package EmployeeProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e=new Employee();
		e.setEid(0);
		e.setEname("Moulla");
		e.setSal(2321);
		e.setDeptno(2);
		
		et.begin();
		em.merge(e);
		et.commit();

	}

}
