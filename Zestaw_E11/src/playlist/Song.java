package playlist;

import java.util.Arrays;
import java.util.Comparator;

public class Song {
    String title;
    String artist;
    int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }

}
class DurationComparator implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        return Integer.compare(o2.duration,o1.duration);
    }
}
class ArtistTitleComparator implements Comparator<Song>{

    @Override
    public int compare(Song o1, Song o2) {
        if(o1.artist.compareTo(o2.artist) == 0){
            return o1.title.compareTo(o2.title);
        }
        return o1.artist.compareTo(o2.artist);
    }
}
class Main{
    public static void main(String[] args) {
        Song[] tab = {new Song("song_1","artist_1",23),
                new Song("song_2","artist_2",435),
                new Song("song_3","artist_3",3),
                new Song("song_4","artist_4",43),
                new Song("song_5","artist_5",13)};
        Arrays.sort(tab,new DurationComparator().thenComparing(new ArtistTitleComparator()));
        for(Song item : tab){
            System.out.println(item);
        }
    }
}
