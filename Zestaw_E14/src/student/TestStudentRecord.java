package student;

public class TestStudentRecord {
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("Vasoi","001",3.7);
        StudentRecord s2 = new StudentRecord("Petoi","002",2.9);
        s1.printDetails();
        s2.printDetails();

        System.out.println(s1.isHonorStudent());
        System.out.println(s2.isHonorStudent());
    }
}
