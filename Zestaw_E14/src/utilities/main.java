package utilities;

public class main {
    public static void main(String[] args) {
        Person p1 = new Person("Vasio",15);
        Person p2 = new Person("Petio",11);
        Person p3 = new Person("Andreio",19);
        Person[] tab = {p1,p2,p3};
        Person p4 = new Person("Nikitio",5);
        System.out.println(countLessThanOrEqual(tab,p4));
    }
    public static <T extends Comparable<T>> int countLessThanOrEqual(T[] tab,T value){
        int result = 0;
        for(int i =0;i<tab.length;i++){
            if(tab[i].compareTo(value) <= 0){
                result++;
            }
        }
        return result;
    }
}
