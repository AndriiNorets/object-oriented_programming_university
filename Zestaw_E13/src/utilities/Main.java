package utilities;

public class Main {
    public static void main(String[] args) {

    }
    public static <T extends Comparable<T>> T findMin(T x,T y,T z){
        T min = x;
        if(y.compareTo(min) <0){
            min = y;
        }
        if(z.compareTo(min) <0){
            min = z;
        }
        return min;
    }
}
