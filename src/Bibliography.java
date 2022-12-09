import java.util.ArrayList;

public class Bibliography {

    private ArrayList<Album> albumList;
    private Artist artist;

    public Bibliography(Artist anArtist){
        super();
        this.albumList = new ArrayList<Album>();
        this.artist = anArtist;
    }

    public ArrayList<Album> getAlbums() {
        return albumList;
    }

    public void removeAlbum(Album anAlbum){
        albumList.remove(anAlbum);
    }

    public void removeAllAlbums(){
        albumList.clear();
    }
}
