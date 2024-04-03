package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("hospital_1",50.0);
        Hospital h2 = new Hospital("hospital_2",99.0);
        Hospital h3 = new Hospital("hospital_3",65.8);
        Clinic c1 = new Clinic("Cinic_1",79.4,4.7);
        Clinic c2 = new Clinic("Cinic_2",43.6,3.6);
        System.out.println(h1.equals(h2));
        System.out.println(h2.equals(h3));
        System.out.println(h3.equals(h3));
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c2));

        System.out.println(h1.toString());
        System.out.println(c1.toString());

    }
}
