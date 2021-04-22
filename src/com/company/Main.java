package com.company;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("a"),
                new Student("b"),
                new Student("a"),
                new Student("b"),
                new Student("c")
        );

        Map<String, List<Student>> groupedByGroupStudents = groupingFunction().apply(students);
    }

    public static Function<List<Student>, Map<String, List<Student>>> groupingFunction() {
        return students -> students.stream().collect(Collectors.groupingBy(Student::getGroup));
    }

}