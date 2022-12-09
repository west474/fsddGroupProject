import java.util.ArrayList;
public class Artist {

    private String artistName;
    private Bibliography bibliography;
    private Genre artistGenre;

    public Artist(String aName, Bibliography aBibliography, Genre aGenre){
        super();
        this.artistName = aName;
        this.bibliography = aBibliography;
        this.artistGenre = aGenre;
    }

    public String getArtistName(){
        return artistName;
    }

    public Bibliography getBibliography() {
        return bibliography;
    }

    public Genre getArtistGenre() {
        return artistGenre;
    }
}
