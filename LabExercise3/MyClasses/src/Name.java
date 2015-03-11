/**
 * A name has a first name and a family name.
 * There is an option to produce a full name by combining these.
 * 
 * @author Luke
 */
public class Name {

	//Fields
	private String title;
	private String artist;
	private int duration;

	//Constructors
	public Name() {
		title = "";
		artist = "";
		duration = 0;
	}
	
	public Name (String title, String artist, int duration) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	
	public Name(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	//Methods
	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public String getAlbum() {
		return title + " " + artist;
	}

	public String toString() {
		return "Album:[title=" + title + ", artist=" + artist + "]";
	}



	
}
