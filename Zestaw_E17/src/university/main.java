package university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Vasio",5);
        Student s2 = new Student(2,"Petio",5);
        Student s3 = new Student(3,"Szurio",5);
        ArrayList<Student> tab = new ArrayList<>();
        tab.add(s3);
        tab.add(s2);
        tab.add(s1);
        for(int i =0;i<tab.size();i++){
            System.out.println(tab.get(i));
        }
        Collections.sort(tab, new AverageGradeComparator().thenComparing(new IdComparator()));
        for(int i =0;i<tab.size();i++){
            System.out.println(tab.get(i));
        }

    }
}
