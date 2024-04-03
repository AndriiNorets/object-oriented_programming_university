package comparisons;

public class Main {
    public static <T extends Comparable<T>> boolean isFirstLargest(T a,T b,T c){
        if(a.compareTo(b) >0 && a.compareTo(c)>0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isFirstLargest(5,2,3));
    }
}
