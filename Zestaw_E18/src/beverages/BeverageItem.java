package beverages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class BeverageItem implements Comparable<BeverageItem>{
    String name;
    double volume;
    double sugarContent;

    public BeverageItem(String name, double volume, double sugarContent) {
        this.name = name;
        this.volume = volume;
        this.sugarContent = sugarContent;
    }

    @Override
    public String toString() {
        return "BeverageItem{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", sugarContent=" + sugarContent +
                '}';
    }

    @Override
    public int compareTo(BeverageItem o) {
        return Double.compare(sugarContent,o.sugarContent);
    }
}
class main{
    public static void main(String[] args) {

        BeverageItem b1 = new BeverageItem("name_1",1.2,9);
        BeverageItem b2 = new BeverageItem("name_2",1.3,6);
        BeverageItem b3 = new BeverageItem("name_3",1.4,4);
        ArrayList<BeverageItem> tab = new ArrayList<>();
        tab.add(b1);
        tab.add(b2);
        tab.add(b3);
        Collections.sort(tab);
        for (BeverageItem item:
             tab) {
            System.out.println(item);
        };
    }
}
