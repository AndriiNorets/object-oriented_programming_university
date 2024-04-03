package tourism;

public class Hotel implements Cloneable{
    private String name;
    private double capacity;
    public Hotel(){

    }

    public Hotel(String name, double capacity) {
        if(name == null){
            this.name = "";
        }
        else this.name = name;
        if(capacity < 0.0){
            this.capacity = 50.0;
        }
        else this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
