package moto;

public class Main {
    public static <T extends Comparable<T>> T maxValue(T[] tab){
        if(tab == null || tab.length == 0){
            throw new IllegalArgumentException();
        }
        T result = tab[0];
        for(T item: tab){
            if (item.compareTo(result) > 0){
                result = item;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("1",10);
        Vehicle v2 = new Vehicle("2",16);
        Vehicle v3 = new Vehicle("3",21);
        Vehicle[] tab = {v1,v2,v3};
        System.out.println(maxValue(tab));
    }
}
