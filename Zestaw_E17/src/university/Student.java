package university;

import java.util.Comparator;

public record Student(int id, String name, double avarageGrade ) {
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avarageGrade=" + avarageGrade +
                '}';
    }
}
class AverageGradeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.avarageGrade(),o1.avarageGrade());
    }
}
class IdComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.id(),o2.id());
    }
}
