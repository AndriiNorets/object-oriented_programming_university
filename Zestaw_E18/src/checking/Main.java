package checking;

public class Main {
    public static void main(String[] args) {
        System.out.println(containsDuplicates(2,2,"dsf"));
    }
    public static <T> boolean containsDuplicates(T a,T b,T c){
        if(a.equals(b) || a.equals(c) || b.equals(c)){
            return true;
        }
        return false;
    }

}
