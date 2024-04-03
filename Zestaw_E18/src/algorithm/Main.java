package algorithm;

import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Iterator<Integer> iterator = numbers.iterator();
        int indexToRetrieve = 2;
        try {
            Integer result = atIndex(iterator, indexToRetrieve);
            System.out.println(result);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getLocalizedMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getLocalizedMessage());
        }


    }
    public static <T> T atIndex(Iterator<T> iterator, int index){
        if(index <0){
            throw new IllegalArgumentException("Index <0");
        }
        while (iterator.hasNext() && index>0){
            iterator.next();
            index--;
        }
        if (!iterator.hasNext()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return iterator.next();

    }
}
