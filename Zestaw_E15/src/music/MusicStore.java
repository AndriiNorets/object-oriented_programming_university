package music;

import java.util.ArrayList;
import java.util.Objects;

public class MusicStore {
    private String name;
    private  String city;
    private ArrayList<String> albums;

    public MusicStore(String name, String city, ArrayList<String> albums) {
        this.name = name;
        this.city = city;
        this.albums = albums;
    }
    void addAlbum(String album){
        albums.add(album);
    }
    void removeAlbum(String album){
        albums.remove(album);
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public ArrayList<String> getAlbums() {
        return new ArrayList<>(albums);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAlbums(ArrayList<String> albums) {
        this.albums = new ArrayList<>(albums);
    }


    @Override
    public String toString() {
        return "MusicStore{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", albums=" + albums +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicStore that = (MusicStore) o;
        return Objects.equals(name, that.name) && Objects.equals(city, that.city) &&
                Objects.equals(albums, that.albums);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, city, albums);
    }


}
class VinylStore extends MusicStore{

    private int numberOfVinyls;
    public VinylStore(String name, String city, ArrayList<String> albums, int numberOfVinyls) {
        super(name, city, albums);
        this.numberOfVinyls = numberOfVinyls;
    }

    @Override
    public String toString() {
        return "VinylStore{" +
                "name='" + super.getName() + '\'' +
                ", city='" + super.getCity() + '\'' +
                ", albums=" + super.getAlbums() +
                "numberOfVinyls=" + numberOfVinyls +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        VinylStore that = (VinylStore) o;
        return numberOfVinyls == that.numberOfVinyls;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfVinyls);
    }
}
