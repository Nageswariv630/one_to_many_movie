package one_to_many_movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class InsertMovie {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et=em.getTransaction();
		Movie m=new Movie();
		m.setName("AMARAN");
		m.setRating(5);
		et.begin();
		Movie dbm=em.merge(m);
		em.merge(m);
		et.commit();
		System.out.println(dbm);
		System.out.println("Done");
	}
}
