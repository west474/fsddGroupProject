public class Song {

    private String songName;
    private int songYear;
    private Genre songGenre;
    private Album songAlbum;
    private Artist songArtist;

    public Song(String aSong, int aYear, Genre aGenre, Album anAlbum, Artist anArtist){
        super();
        this.songName = aSong;
        this.songYear = aYear;
        this.songGenre = aGenre;
        this.songAlbum = anAlbum;
        this.songArtist = anArtist;
    }

    public String getSongName(){
        return songName;
    }

    public int getSongYear(){
        return songYear;
    }

    public Genre getSongGenre() {
        return songGenre;
    }

    public Album getSongAlbum() {
        return songAlbum;
    }

    public Artist getSongArtist() {
        return songArtist;
    }
}