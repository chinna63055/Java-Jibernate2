package MOBILE;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchMobile {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("FROM Mobile");
		List<Mobile> mobiles = q.getResultList();
		for(Mobile m:mobiles)
		{
			System.out.println("----- Moblie Details -------");
			System.out.println("Mobile ID : "+m.getMid());
			System.out.println("Brand : "+m.getBrand());
			System.out.println("MRP : "+m.getPrice());
			System.out.println("-------- Sim Card ---------");
			List<Sim>sims =m.getSims();
			for(Sim s:sims)
			{
				System.out.println(s.getSid());
				System.out.println(s.getProvider());
				System.out.println(s.getType());
				System.out.println("//////////////////////////////");
				System.out.println();
			}
		}

	}

}
