package algorithm;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student("Vasio",13);
        Student s2 = new Student("Vasio",13);
        Student s3 = new Student("Vasio",13);

        System.out.println(compareThree(s1,s2,s3));
    }
    public static <T> boolean compareThree(T a,T b ,T c){
        return (a.equals(b)==true & a.equals(c)==true);
    }


}
