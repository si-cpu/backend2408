package song;

import java.io.Serializable;
import java.util.Set;

public class Artist implements Serializable {

    private String artistName;
    private Set<String> songList;

    public Artist(final String artistName, final Set<String> songList) {
        this.artistName = artistName;
        this.songList = songList;
    }

    public boolean addSong(String songname){
        this.songList.add(songname);
        return false;
    }
    /*    Set의 add 객체 추가 성공여부를 리턴.
    public boolean addSong(String songname){
        return this.songList.add(songname);
    }
    */

    public String getArtistName() {
        return this.artistName;
    }

    public void setArtistName(final String artistName) {
        this.artistName = artistName;
    }

   public Set<String> getSongList() {
        return this.songList;
    }

    public void setSongList(final Set<String> songList) {
        this.songList = songList;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", songList=" + songList +
                '}';
    }
}
