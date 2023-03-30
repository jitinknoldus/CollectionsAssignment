package com.knoldus.CollectionsAssignment.task10;

import java.util.LinkedHashSet;
import java.util.Objects;

class Student{
    String name;
    Integer rollNo;

    public Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(rollNo, student.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }
}


public class DuplicateObjects {
    public static void main(String[] args) {
        LinkedHashSet<Student> students = new LinkedHashSet<>();
        students.add(new Student("Salil", 1879));
        students.add(new Student("Jitin", 1856));
        students.add(new Student("Sahil", 1883));
        students.add(new Student("Riya", 1881));

        for (Student student: students)
        {
            System.out.println(student.name+" "+student.rollNo);
        }
    }
}
