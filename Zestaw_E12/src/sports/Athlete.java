package sports;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;

public class Athlete {
    String name;
    String nationality;
    double[] records;

    public Athlete(String name, String nationality, double[] records) {
        this.name = name;
        this.nationality = nationality;
        this.records = records;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", records=" + Arrays.toString(records) +
                '}';
    }

    public double[] getRecords() {
        return records;
    }
}
class RecordComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        double max1 = o1.records[0];
        double max2 = o1.records[0];
        for (int i =0;i<o1.records.length;i++){
            if(o1.records[i] > max1){
                max1 = o1.records[i];
            }
        }
        for (int i =0;i<o2.records.length;i++){
            if(o2.records[i] > max1){
                max2 = o2.records[i];
            }
        }
        return Double.compare(max1,max2);
    }
}
class NationalityNameComparator implements Comparator<Athlete>{

    @Override
    public int compare(Athlete o1, Athlete o2) {
        if(o1.nationality.compareTo(o2.nationality) == 0){
            return o1.name.compareTo(o2.name);
        }
        return o1.nationality.compareTo(o2.nationality);
    }
}
