package restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Chef implements Comparator<Chef> {
    int id;
    String name;
    double skillLevel;

    public Chef(int id, java.lang.String name, double skillLevel) {
        this.id = id;
        this.name = name;
        this.skillLevel = skillLevel;
    }

    public Chef() {

    }

    @Override
    public int compare(Chef o1, Chef o2) {
        if(Double.compare(o2.skillLevel,o1.skillLevel) == 0){
            return o1.name.compareTo(o2.name);
        }
        return Double.compare(o2.skillLevel,o1.skillLevel);
    }

    @Override
    public String toString() {
        return "Chef{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }
}
class TestChef{
    public static void main(String[] args) {
        ArrayList<Chef> tab = new ArrayList<>();
        Comparator<Chef> comparatorr;
        Chef c1 = new Chef(1,"Vasio",5.0);
        Chef c2 = new Chef(2,"Petio",2.0);
        Chef c3 = new Chef(3,"Maksio",4.0);
        tab.add(c1);
        tab.add(c2);
        tab.add(c3);
        Collections.sort(tab,new Chef());
        for (Chef item:
             tab) {
            System.out.println(item);
        }
    }
}

