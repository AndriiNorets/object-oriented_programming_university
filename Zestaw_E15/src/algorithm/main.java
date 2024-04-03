package algorithm;

import java.util.Collection;

public class main {
    public static <T> void clearIfContains(Collection<T> tab, T value) throws IllegalAccessException {
        if(tab != null){
            if(tab.contains(value)){
                tab.clear();
            }
        }else {
            throw new IllegalAccessException("Error: collection is null");
        }
    }
//    public static <T> void clearIfContains(Collection<T> collection, T element){
//        if (collection == null) {
//            throw new IllegalArgumentException("Collection cannot be null");
//        }
//        if(collection.contains(element)){
//            collection.clear();
//        }
//    }

    public static void main(String[] args) throws IllegalAccessException {
        Collection<String> tab = null;
        String value = "example";
        clearIfContains(tab,value);
    }
}
