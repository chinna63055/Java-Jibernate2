package EmployeeProject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAll {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		
		String sql="FROM Employee WHERE ename=Moulla";
		
		Query q=em.createQuery(sql);
		List<Employee> n = q.getResultList();
		
		for(Employee e:n) {
			System.out.println(e.getEid());
			System.out.println(e.getDeptno());
			System.out.println(e.getEname());
			System.out.println(e.getSal());
			System.out.println("-----");
		}
	}

}
