package algorithm;

import java.util.HashMap;
import java.util.Hashtable;

public class main {
    public static void main(String[] args) {
        Person p1 = new Person("Vasio_1");
        Person p2 = new Person("Vasio_2");
        HashMap<Integer,Person> map = new HashMap<>();
        map.put(1,p1);
        map.put(2,p2);
        System.out.println(mapToString(map));

    }
    public static <K, V> String mapToString(HashMap<K, V> map){
        String result = "";
        for(K i :map.keySet()){
            result +=i + ":" + map.get(i)+", " ;
        }
        return result;
    }
}
class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }
}
