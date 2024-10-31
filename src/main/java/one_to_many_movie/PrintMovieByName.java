package one_to_many_movie;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class PrintMovieByName {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		int sid=3;
		Song s=em.find(Song.class, sid);
		List<Movie>ml=em.createQuery("from Movie").getResultList();
		for(Movie m:ml) {
			List<Song>sl=m.getSong();
			for(Song song:sl) {
				if(song.getId()==s.getId()) {
					System.out.println(m.getName());
				}
			}
		}
	}

}
