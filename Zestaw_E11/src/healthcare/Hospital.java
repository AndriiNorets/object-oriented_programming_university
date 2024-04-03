package healthcare;

import java.util.Objects;

public class Hospital {
    String name;
    double capacity;

    public Hospital(String name, double capacity) {
        if(name == null){
            name = "";
        }
        this.name = name;
        if (capacity < 0){
            capacity = 50.0;
        }
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        if(name == null){
            name = "";
        }
        this.name = name;
    }

    public void setCapacity(double capacity) {
        if (capacity < 0){
            capacity = 50.0;
        }
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        if(name == ""){
            return getClass().getSimpleName() +
                    ": capacity=" + capacity +
                    '}';
        }
        return getClass().getSimpleName() +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Double.compare(capacity, hospital.capacity) == 0 && Objects.equals(name, hospital.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}
