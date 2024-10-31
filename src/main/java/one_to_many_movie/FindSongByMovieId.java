package one_to_many_movie;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FindSongByMovieId {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		System.out.println("Enter Id:");
		Song c=em.find(Song.class, new Scanner(System.in).nextInt());
		System.out.println(c.getName());
	}

}


