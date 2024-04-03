package utilities;

import java.util.ArrayList;
import java.util.List;

public class utilities {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        a.add("fg");
        a.add("jjjjj");
        a.add("oooooo");
        ArrayList<String> b = new ArrayList<>();
        appendFromEnd(a, b);
        for (int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i));
        }
    }
    public static <E> void appendFromEnd(ArrayList<E> list1, ArrayList<? super E> list2) {
        for (int i = list1.size() - 1; i >= 0; i--) {

            list2.add(list1.get(i));
        }

    }
}

