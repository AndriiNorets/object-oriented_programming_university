package university;

import java.util.Arrays;

public record Student(String name, double averageGrade, int yearOfStudy) implements Comparable<Student>{

    @Override
    public int compareTo(Student o) {
        if (Double.compare(o.averageGrade, this.averageGrade) == 0) {
            return Integer.compare(this.yearOfStudy, o.yearOfStudy);
        }
        return Double.compare(o.averageGrade, this.averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }
}
class main{
    public static void main(String[] args) {
        Student s1 = new Student("Vasio_1",3.9,4);
        Student s2 = new Student("Vasio_2",3.5,3);
        Student s3 = new Student("Vasio_3",3.5,2);
        Student s4 = new Student("Vasio_4",3.5,1);
        Student[] tab = {s1,s2,s3,s4};
        Arrays.sort(tab);
        for(int i =0;i<tab.length;i++){
            System.out.println(tab[i]);
        }

    }
}
