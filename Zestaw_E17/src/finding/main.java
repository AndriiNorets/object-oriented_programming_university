package finding;

public class main {
    public static void main(String[] args) {
        Integer[] tab = {null,null,null,null};
        System.out.println(findFirstNonNull(tab));
    }
    public static <T> T findFirstNonNull(T[] tab){
        T result = null;
        for (int i =0;i<tab.length;i++){
            if (tab[i] != null){
                result = tab[i];
                break;
            }
        }
        return result;
    }
}
