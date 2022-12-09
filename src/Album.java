import java.util.ArrayList;
public class Album {

    private String albumName;
    private int albumYear;
    private ArrayList<Song> albumSongs;
    private Genre albumGenre;
    private Artist albumArtist;

    public Album(String aName, int aYear, Genre aGenre, Artist anArtist) {
        super();
        this.albumName = aName;
        this.albumYear = aYear;
        this.albumSongs = new ArrayList<Song>();
        this.albumGenre = aGenre;
        this.albumArtist = anArtist;
    }

    public String getAlbumName(){
        return albumName;
    }

    public int getAlbumYear(){
        return albumYear;
    }

    public Genre getAlbumGenre(){
        return albumGenre;
    }

    public Artist getAlbumArtist() {
        return albumArtist;
    }

    public ArrayList<Song> getAlbumSongs() {
        return albumSongs;
    }

    public void addSong(Song newSong){
        albumSongs.add(newSong);
    }

    public void removeSong(Song oldSong){
        albumSongs.remove(oldSong);
    }

}
