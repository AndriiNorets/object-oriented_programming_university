package swap;

public class Main {
    public static <T> void swapElements(T[] tab,int a, int b){
        if(a < tab.length || b< tab.length){
            T value = tab[a];
            tab[a] = tab[b];
            tab[b] = value;
        }
    }

    public static void main(String[] args) {
        String[] tab = new String[]{"apple", "banana", "cherry"};
        swapElements(tab, 0, 2);
        System.out.println(tab[0]);

        VideoGame v1 = new VideoGame("GTA 4","Rockstar games",3);
        VideoGame v2 = new VideoGame("GTA 5","Rockstar games",5);
        VideoGame[] tab_2 = {v1,v2};
        System.out.println(tab_2[0]);
        System.out.println(tab_2[1]);
        swapElements(tab_2,0,1);
        System.out.println(tab_2[0]);
        System.out.println(tab_2[1]);

    }
}
