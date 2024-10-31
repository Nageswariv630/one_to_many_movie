package one_to_many_movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertSong {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et=em.getTransaction();
		Song s=new Song();
		s.setName("chaleya");
		s.setSinger("arjit");
		et.begin();
		Song dbs=em.merge(s);
		et.commit();
		System.out.println(dbs);
		System.out.println("Done");
	}

}

