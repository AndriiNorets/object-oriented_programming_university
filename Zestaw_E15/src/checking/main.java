package checking;

public class main {
    public static <T> boolean isEqualOrNull(T object1, T object2){
        if (object1 == null && object2 == null)
        {
            return true;
        }
        return object1.equals(object2);
    }
//    public static <T> boolean isEqualOrNull(T arg1, T arg2){
//        if(arg1 == null && arg2 == null){
//            return true;
//        }
//        if(arg1 == null || arg2 == null){
//            return false;
//        }
//        return arg1.equals(arg2);
//    }
//}

    public static void main(String[] args) {
        String s1 = null;
        Object s2 = null;
        System.out.println(isEqualOrNull(s1,s2));
    }
}
