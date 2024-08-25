package song;

import java.io.Serializable;
import java.util.Set;

public class Artist implements Serializable {

    String name;
    Set<String> songList;

    public Artist(final String name, final Set<String> songList) {
        this.name = name;
        this.songList = songList;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", songList=" + songList +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Set<String> getSongList() {
        return this.songList;
    }

    public void setSongList(final Set<String> songList) {
        this.songList = songList;
    }
}
