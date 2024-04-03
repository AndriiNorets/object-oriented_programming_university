package aviation;

import java.util.Arrays;

public class Pilot implements Cloneable{
    String name;

    double[] flightHours = new double[5];

    public Pilot(String name, double[] flightHours) {
        this.name = name;
        if (flightHours.length == 5){
            this.flightHours = Arrays.copyOf(flightHours,5);
        }else throw new IllegalArgumentException("Blędnie podana tabela");
    }

    public void changeValue(double value,int index){
        this.flightHours[index] = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pilot clonedPilot = (Pilot) super.clone();
        clonedPilot.flightHours = Arrays.copyOf(this.flightHours, this.flightHours.length);
        return clonedPilot;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + Arrays.toString(flightHours) +
                '}';
    }
}
