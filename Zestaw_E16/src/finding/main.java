package finding;

import java.util.HashMap;

public class main {
    public static <K, V> V findValueByKey(HashMap<K, V> map, K key){
        if( map == null || key == null){
            throw new IllegalArgumentException();
        }
        return map.get(key);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Zalupa",1234);
        System.out.println(findValueByKey(map,"Zalupa"));
    }
}
