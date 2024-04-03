package algorithm;

import java.util.Objects;

public class Student {
    String name;
    float grade;

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.compareTo(student.name) == 0 &&
                Float.compare(grade,student.grade)==0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}
