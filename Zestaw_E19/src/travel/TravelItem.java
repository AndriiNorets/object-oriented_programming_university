package travel;

import java.util.Arrays;

public class TravelItem implements Comparable<TravelItem> {
    String name;
    double weight;
    double volume;

    public TravelItem(String name, double weight, double volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
    }

    @Override
    public int compareTo(TravelItem o) {
        return Double.compare(weight,o.weight);
    }

    @Override
    public String toString() {
        return "TravelItem{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", volume=" + volume +
                '}';
    }
}
class Main{
    public static void main(String[] args) {
        TravelItem t1 = new TravelItem("V pizdu_1",19,34);
        TravelItem t2 = new TravelItem("V pizdu_2",16,34);
        TravelItem t3 = new TravelItem("V pizdu_3",12,34);
        TravelItem t4 = new TravelItem("V pizdu_4",6,34);
        TravelItem[] tab ={t1,t2,t3,t4};
        Arrays.sort(tab);
        for (TravelItem item:
             tab) {
            System.out.println(item);
        }
    }
}
