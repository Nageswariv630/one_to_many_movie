package one_to_many_movie;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MapSongToMovie {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et=em.getTransaction();
        int s1=1;
        int s2=2;
        int s3=3;
        
        
        int m1=1;
       Song song1=em.find(Song.class,s1);
        Song song2=em.find(Song.class,s2);
        Song song3=em.find(Song.class,s3);
        Movie mov1=em.find(Movie.class, m1);
        List<Song>song=new ArrayList<Song>();
        song.add(song1);
        song.add(song2);
        song.add(song3);
        mov1.setSong(song);
        et.begin();
        em.merge(mov1);
        et.commit();
        System.out.println("Done");
	}

}
//findsongbymovieid
