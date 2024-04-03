package algorithm;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static <K,V> String mapToString(TreeMap<K, V> map){
        String result ="";
        for (K key:
             map.keySet()) {
            result += key+":"+map.get(key) +", ";
        }
        return result;
    }

    public static void main(String[] args) {
        TreeMap<Integer,Person> map = new TreeMap<>();
        Person p1 = new Person("Vasio");
        Person p2 = new Person("Petio");
        Person p3 = new Person("Kolio");
        map.put(1,p1);
        map.put(2,p2);
        map.put(3,p3);

        System.out.println(mapToString(map));
    }
}
class Person{
    String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
