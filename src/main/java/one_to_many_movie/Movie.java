package one_to_many_movie;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int rating;
	@OneToMany
	private List<Song> song;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public List<Song> getSong() {
		return song;
	}
	public void setSong(List<Song> song) {
		this.song = song;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	
	
	

}

