package one_to_many_movie;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteMovieBySongId {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et=em.getTransaction();
		System.out.println("Enter Song Id:");
		int sid=sc.nextInt();
		Song m=em.find(Song.class, sid);
}
}