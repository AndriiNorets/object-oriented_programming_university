package university;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static <T> int countElements(Iterator<T> items, T element){
        int result =0;
        if(!items.hasNext()){
            return 0;
        }
        while (items.hasNext()){
            T value = items.next();
            if(element.equals(value)){
                result++;
            }
            items.next();
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Student> tab = new ArrayList<>();
        tab.add(new Student("Vasio_1",1.0));
        tab.add(new Student("Vasio_1",1.0));
        tab.add(new Student("Vasio_2",3.0));
        tab.add(new Student("Vasio_3",23.0));
        tab.add(new Student("Vasio_1",1.0));
        tab.add(new Student("Vasio_4",23.0));
        tab.add(new Student("Vasio_1",1.0));
        tab.add(new Student("Vasio_5",56.0));
        Student ss = new Student("Vasio_1",1.0);
        Iterator<Student> iterator = tab.iterator();
        System.out.println(countElements(iterator,ss));
    }
}
