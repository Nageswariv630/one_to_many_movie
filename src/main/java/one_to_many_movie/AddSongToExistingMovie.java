package one_to_many_movie;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddSongToExistingMovie {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et=em.getTransaction();
		System.out.println("Enter Movie Id:");
		int mid=sc.nextInt();
		Movie m=em.find(Movie.class, mid);
		if(m==null) {
			System.err.println("Invalid Movie Id");
			return;
		}
		System.out.println("Enter Song Name");
		String name=sc.next();
		System.out.println("Enter Singer Name");
		String singer=sc.next();
		Song s=new Song(0,name,singer);
		List<Song>sl=m.getSong();
		sl.add(s);
		m.setSong(sl);
		et.begin();
		em.persist(s);
		em.merge(m);
		et.commit();
		System.out.println("Done");
	}

}
