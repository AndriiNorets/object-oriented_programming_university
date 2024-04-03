package transport;

import java.util.ArrayList;
import java.util.Objects;

public class BusStation {
    private String name;
    private String city;
    private ArrayList<String> buses;

    public BusStation(String name, String city, ArrayList<String> buses) {
        this.name = name;
        this.city = city;
        this.buses = new ArrayList<>(buses);
    }
    public void addBus(String bus){
        if(bus != null){
            buses.add(bus);
        }
    }
    public void removeBus(String bus){
        if(bus != null){
            buses.remove(bus);
        }
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public ArrayList<String> getBuses() {
        return new ArrayList<>(buses);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBuses(ArrayList<String> buses) {
        this.buses = new ArrayList<>(buses);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusStation that = (BusStation) o;
        return Objects.equals(name, that.name) && Objects.equals(city, that.city) && Objects.equals(buses, that.buses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, buses);
    }

    @Override
    public String toString() {
        return "BusStation{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", buses=" + buses +
                '}';
    }
}
class IntercityBusStation extends BusStation{
    private int numberOfPlatforms;
    public IntercityBusStation(String name, String city, ArrayList<String> buses,int numberOfPlatforms) {
        super(name, city, buses);
        this.numberOfPlatforms = numberOfPlatforms;
    }

    public int getNumberOfPlatforms() {
        return numberOfPlatforms;
    }

    public void setNumberOfPlatforms(int numberOfPlatforms) {
        this.numberOfPlatforms = numberOfPlatforms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IntercityBusStation that = (IntercityBusStation) o;
        return numberOfPlatforms == that.numberOfPlatforms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPlatforms);
    }
}
