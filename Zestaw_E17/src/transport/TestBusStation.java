package transport;

import java.util.ArrayList;

public class TestBusStation {
    public static void main(String[] args) {
        ArrayList<String> tab = new ArrayList<>();
        tab.add("E10");
        tab.add("E27");
        tab.add("D44");

        ArrayList<String> tab_2 = new ArrayList<>();
        tab_2.add("E11");
        tab_2.add("E28");
        tab_2.add("D45");

        BusStation b1 = new BusStation("Olsztyn glówny","Olsztyn",tab);
        IntercityBusStation b2 = new IntercityBusStation("Elbląg glówny","Elbląg",tab_2 , 5);

        System.out.println(b1.toString());
        System.out.println(b2.toString());

        b1.addBus("E34");
        b2.addBus("E23");
        b1.removeBus("E10");
        b2.removeBus("D45");

        System.out.println(b1.toString());
        System.out.println(b2.toString());

    }
}
