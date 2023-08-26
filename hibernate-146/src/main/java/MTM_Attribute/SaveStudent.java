package MTM_Attribute;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s = new Student();
		s.setSid(1);
		s.setName("Ayath");

		Student s1 = new Student();
		s1.setSid(2);
		s1.setName("Lokesh");
		
		Course c = new Course();
		c.setCid(101);
		c.setSub("Java");
		

		Course c1 = new Course();
		c1.setCid(102);
		c1.setSub("Java Script");
		

		Course c2 = new Course();
		c2.setCid(103);
		c2.setSub("Html");
		

		Course c3 = new Course();
		c3.setCid(104);
		c3.setSub("SQL");
		
		List<Course> cl=new ArrayList<>();
		cl.add(c);
		cl.add(c2);
		cl.add(c3);
		s.setCourses(cl);
		
		List<Course> cl1=new ArrayList<>();
		cl1.add(c);
		cl1.add(c2);
		s1.setCourses(cl);
		
		List<Student> sl=new ArrayList<>();
		sl.add(s);

		c.setStudents(sl);
		
		List<Student> sl1=new ArrayList<>();
		sl1.add(s);
		sl1.add(s1);

		c1.setStudents(sl1);
		
		List<Student> sl2=new ArrayList<>();
		sl2.add(s);
		sl2.add(s1);

		c2.setStudents(sl2);
		
		List<Student> sl3=new ArrayList<>();
		sl3.add(s);
		
		c3.setStudents(sl3);
		
		et.begin();
		em.persist(s);
		em.persist(s1);
		em.persist(c);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(sl1);
		em.persist(sl2);
		em.persist(sl3);
		et.commit();
		
	}

}
