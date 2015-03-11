/*
 * Example of an aggregation.
 */

import java.util.ArrayList; //import as instance variable is of type ArrayList
import java.util.Collections; //import to use sort method on ArrayList
import java.util.Iterator;

/** A PlayList is collection of Songs. The list can be named. 
 * The playlist has many features including but not limited to
 * shuffling, merging, searching and reordering.
 * 
 *  @author la, lz 
 */
public class PlayList implements Iterable<Song> {

	//Fields
    private String name; //the name for this songlist
    private ArrayList<Song> songlist; //collection of songs

    
    //Constructors
    /** Create an empty playlist with no title. */
    public PlayList() {
        this.name = "Untitled";
        songlist = new ArrayList<Song>();
    }

    /** Create an empty playlist with the given name.
     * @param name The name of this playlist. */
    public PlayList(String name) {
        this.name = name;
        songlist = new ArrayList<Song>();
    }

    
    //Methods
    /** Sets the playlist name to the specified value.
     * @param  name The name for this playlist. */
    public void setName(String name) {
        this.name = name;
    }
    
    /** Returns the name of this playlist.
     * @return The name of this playlist. */
    public String getName() {
        return name;
    }
    
    public Iterator<Song> iterator() {
    	return songlist.iterator();
    }

    
    /**Returns a string containing the playlist song data. */
    @Override
    public String toString() {
        return "PlayList:[name=" + name + ", songlist=" + songlist + "]";
    }

    
    /* ****************************************************
     * These are some of the common methods you have in an
     * aggregation class implementation, they generally are 
     * able to simply delegate to internal data structure, i.e. ArrayList
     *******************************************************/
    
    /** Adds the given song to the end of the playlist.
     * @param s The Song to add. */
    public void addSong(Song s) {
        songlist.add(s);
    }

    /** Removes the song at index i from the playlist.
     * @param i The index of the song to be remove,
     * provided 0 &le; i &lt; number of songs, otherwise does nothing.*/
    public void removeSong(int i) {
        songlist.remove(i);
    }

    /** Returns the number of songs in the playlist.
     * @return Number of songs in the playlist. */
    public int numberOfSongs() {
        return songlist.size();
    }
    
    /** Clears all entries from the playlist */
    public void clearPlayList() {
        songlist.clear();
    }
    
    /** Checks if the playlist is empty.
     * @return true or false depending on whether the playlist is empty. */
    public boolean isPlayListEmpty() {
    	return songlist.isEmpty();
    }
    
    /** Returns the song at index i.
     * @return The song at index i, provided &le; i &lt; 
     * number of songs. Otherwise returns null.*/
    public Song getSong(int i) {
        Song s = null;
        if (0 <= i && i < songlist.size()) {
            s = songlist.get(i);
        } else {
            s = null; // i is out of range
        }
        return s;
    }
    
    
    /* ****************************************************
     * These are some other methods specific to this PlayList
     * class implementation, giving it more functionality.
     *******************************************************/
    
    /** Returns the total duration of the playlist.
     * @return The duration of all the songs on the list in seconds.*/
    public int getTotalTime() {
        //using for-each loop
    	/*int total = 0;
        for (Song s : songlist) {
            total = total + s.getDuration();
        }
        return total;*/
    	
    	//using Java 8 streams
    	return songlist.stream().mapToInt(s -> s.getDuration()).sum();
    }

    /** Move song i up one place in the list. 
     * @param i The index of song to move up, 
     * do nothing if i is out of range.*/
    public void moveUp(int i) {
        if (i > 0 && i < songlist.size());  {
	        	Song s = songlist.get(i - 1);
	        	songlist.set(i-1,  songlist.get(i));
	        	songlist.set(i, s);
        }

    }
    
    /** Move song i down one place in the list. 
     * @param i The index of song to move down, 
     * do nothing if i is out of range.*/
    public void moveDown(int i) {
        if (i >= 0 && i < songlist.size()-1);  {
	        	Song s = songlist.get(i + 1);
	        	songlist.set(i+1,  songlist.get(i));
	        	songlist.set(i, s);
        }
    }
    
    /** Shuffles the songs in the playlist into a random order */
    public void shufflePlaylist() {
    	//The shuffle method is static, which means it can be called
    	//on the Collections class without it being instantiated.
    	Collections.shuffle(songlist);
    }
    
    /** Merges this playlist with another *
     * @param p The playlist to be merged with this one. */
    public void mergePlaylist(PlayList p) {
    	for (int i = 0; i < p.numberOfSongs(); i++) {
       //     songlist.add(p.getSong(i));
            
            p.forEach(s-> songlist.add(s));
    	}    	
    }
    
    /** Searches for the provided title in the song list and returns true or false
     * @param title The song title to be searched for.
     * @return true or false depending on whether the song exists in the playlist.
     */
    public boolean searchSongByTitle(String title) {
    	//using for-each loop
    	/*boolean exists = false;

    	for (Song s : songlist) {
    		if (s.getTitle().equals(title)) {
    			exists = true;
    		}
    	}

    	return exists;*/

    	//using Java 8 streams
    	return songlist.stream().anyMatch(s -> s.getTitle().equals(title));

    }
    
    /**Counts the number of song occurrences with a duration less than that provided.
     * @param duration The duration to be tested against. Specifically songs with 
     * a duration less than this will be counted.
     * @return The number of songs with a duration less than that provided.
     */
    public int countSongsWithDurationLessThan(int duration) {
    	//using for-each loop
    	/*int count = 0;

    	for (Song s : songlist) {
    		if (s.getDuration() < duration) {
    			count++;
    		}
    	}

    	return count;*/
    	
    	//using Java 8 streams
    	return (int) songlist.stream().filter(s -> s.getDuration() < duration).count();
    }
    

    /**Returns a string containing the track listings in numbered order
     * @return The track listings in numbered order. */
    public String getTrackListings() {
    	String s = "PlayList: " + this.name + "\n";
        
        for (int i = 0; i < songlist.size(); i++) {
            s = s + (i+1) + "\t" + songlist.get(i).toString() + "\n";
        }
        return s;       
    }
    
}