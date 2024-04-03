package arrayAlg;

public class VideoGame implements Comparable<VideoGame>{
    String name;
    String developer;
    float rating;

    public VideoGame(String name, String developer, float rating) {
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    @Override
    public int compareTo(VideoGame o) {
        return Float.compare(rating,o.rating);
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", rating=" + rating +
                '}';
    }
}
class TestArrayAlg{
    public static void main(String[] args) {
        VideoGame[] games = {
                new VideoGame("The Witcher 3", "CD Projekt", 9.5f),
                new VideoGame("Red Dead Redemption 2", "Rockstar Games", 9.8f),
                new VideoGame("Cyberpunk 2077", "CD Projekt", 7.0f),
                new VideoGame("Assassin's Creed Valhalla", "Ubisoft", 8.0f)
        };

        int maxIndex = findMaxIndex(games);
        System.out.println(games[maxIndex]);

    }
    public static <T extends Comparable<T>> int findMaxIndex(T[] tab){
        if(tab == null || tab.length == 0){
            throw new  IllegalArgumentException();
        }
        int wynik = 0;
        for(int i =1;i<tab.length;i++){
            if(tab[wynik].compareTo(tab[i]) < 0){
                wynik = i;
            }
        }
        return wynik;
    }
}
