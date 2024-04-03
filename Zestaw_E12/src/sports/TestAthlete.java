package sports;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {

        Athlete a1 = new Athlete("Vasio","ukr", new double[]{1.3, 66, 32, 45.0});
        Athlete a2 = new Athlete("Petio","bl",new double[]{1.3, 65.9, 32, 45});
        Athlete a3 = new Athlete("Szura","pl",new double[]{6.8,34,87.9});
        Athlete[] tab = {a3,a2,a1};
        Arrays.sort(tab,new RecordComparator().thenComparing(new NationalityNameComparator()));
        for(int i =0;i<tab.length;i++){
            System.out.println(tab[i]);
        }


    }
}
