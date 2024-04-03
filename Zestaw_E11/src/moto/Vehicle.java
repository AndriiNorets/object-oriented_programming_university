package moto;

public class Vehicle implements Comparable<Vehicle>{
    String model;
    double speed;

    public Vehicle(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Vehicle o) {
        return Double.compare(speed,o.speed);
    }
}
