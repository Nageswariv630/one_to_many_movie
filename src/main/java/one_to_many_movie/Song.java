package one_to_many_movie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String singer;
	public Song() {
		
	}
	
	public String getSinger() {
		return singer;
	}
	public Song(int i, String name, String singer) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
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

}

