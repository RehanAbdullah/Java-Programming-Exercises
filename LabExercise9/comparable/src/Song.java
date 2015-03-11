
/** Song details are the song title, the song's duration, and the artist.
 * There is no specific functionality apart from simulating playing the song,
 * so this class consists mostly of standard 'set' and 'get ' methods. 
 * 
 * @author la, lz
 */
public class Song implements Comparable<Song> {
	
    //Fields
    private String title;
    private int duration; //length of song in seconds
    private String artist;

    
    //Constructors
    public Song() {
        this.title = "No Song";
        this.duration = 0;
        this.artist = "None";
    }

    public Song(String title, int duration, String artist) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }
    
    

    //Methods
    /** Simulates playing this song.
     * by displaying the song details to the console.*/
    public void play() {
        System.out.println("Now Playing: " + this.toString());
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

   
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }
    
    public int compareTo(Song other) {
    	int result = this.title.compareTo(other.title); 
    	
    	if(result == 0) {
    		 result = this.artist.compareTo(other.artist);
    		
    		if (result == 0) {
    			result = Integer.compare(this.duration,other.duration);
    		}
    	}
    	
    	return result;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
   


    public String toString() {
        return "Song:[title=" + title + ", duration=" + duration + ", artist=" + artist + "]";
    }

	
}