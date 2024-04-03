package music;

import java.util.ArrayList;
import java.util.List;

public class TestMusicStore {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Cristoforo Colombo");
        l1.add("Dragonborn");
        MusicStore m1 = new MusicStore("Zalupa","Olsztyn",l1);
        m1.addAlbum("Utopia");
        System.out.println(m1.toString());
        m1.removeAlbum("Dragonborn");
        System.out.println(m1.toString());

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Cristoforo Colombo");
        l2.add("Dragonborn");
        VinylStore m2 = new VinylStore("Zalupa_2","Ostróda",l2,23);
        m2.addAlbum("Utopia");
        System.out.println(m2.toString());
        m2.removeAlbum("Dragonborn");
        System.out.println(m2.toString());
    }
}
