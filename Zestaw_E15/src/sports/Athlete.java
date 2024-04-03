package sports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public record Athlete(String name, String sport, int yearOfAchievement) implements Comparable<Athlete>{

    @Override
    public int compareTo(Athlete o) {
        return Integer.compare(this.yearOfAchievement,o.yearOfAchievement);
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", yearOfAchievement=" + yearOfAchievement +
                '}';
    }
}
class main{
    public static void main(String[] args) {
        Athlete a1 = new Athlete("Zalupenko","football",4);
        Athlete a2 = new Athlete("Zmyszenko","football",23);
        Athlete a3 = new Athlete("Chujeno","football",7);
        ArrayList<Athlete> tab = new ArrayList<>();
        tab.add(a1);
        tab.add(a2);
        tab.add(a3);

        for (Athlete athlete : tab) {
            System.out.println(athlete);
        }
        Collections.sort(tab);
//        tab.sort(null);

        System.out.println("Sorted Athletes:");
        for (Athlete athlete : tab) {
            System.out.println(athlete);
        }
    }
}
