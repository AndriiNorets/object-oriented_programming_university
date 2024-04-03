package aviation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pilot implements Cloneable{
    String name;
    ArrayList<Double> flightHours;
    public  Pilot(){}
    public Pilot(String name, ArrayList<Double> flightHours) {
        this.name = name;
        this.flightHours = new ArrayList<>(flightHours);
    }
    public void changeElement(double value,int index){
        this.flightHours.set(index, value);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pilot result = (Pilot)super.clone();
        result.flightHours = new ArrayList<>(result.flightHours);
        return result;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + flightHours +
                '}';
    }
}
class TestPilot{
    public static void main(String[] args) {
        ArrayList<Double> tab = new ArrayList<>();
        tab.add(1.5);
        tab.add(8.6);
        tab.add(10.4);

        Pilot p1 = new Pilot("Vasio",tab);
        Pilot p2 = new Pilot();

        try {
            p2 = (Pilot)p1.clone();
            p1.changeElement(11.0,2);
            System.out.println(p1);
            System.out.println(p2);
        }catch (CloneNotSupportedException e){
            System.out.println(e.getLocalizedMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
