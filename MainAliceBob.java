import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MainAliceBob {
    public static void main(String[] args) {
        int[] grades = {34, -5, 18, 21, 40};
        new MainAliceBob().makeAliceBob(grades).forEach(System.out::println);
    }

    Stream<Student> makeAliceBob(int [] array){
        return Arrays.stream(array)
                .filter(num -> num >= 0)
                .mapToObj(num -> new Student((num % 2 == 0) ? "Alice" : "Bob", num));
    }
}

import java.util.ArrayList;

public class MainCountStudents {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 75));
        students.add(new Student("Bob", 85));
        students.add(new Student("Charlie", 65));
        students.add(new Student("Dave", 90));

        int threshold = 80;
        int count = countStudents(students, threshold);
        System.out.println(threshold + ": " + count);
    }

    static int countStudents(ArrayList<Student> students, int threshold){
        return (int) students.stream()
                .filter(s -> s.getGrade() > threshold)
                .count();
    }
}

import java.util.Arrays;

public class MainFilterSortPrint {
    public static void main(String[] args) {
        int[] array = {34, -5, 18, 21, -40};
        new MainFilterSortPrint().doFilterSortPrint(array);
    }

    void doFilterSortPrint(int []array){
        Arrays.stream(array)
                .filter(num -> num >= 0)
                .sorted()
                .forEach(num -> System.out.print(num + " "));
    }
}

public class MainPrintNames {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 75),
                new Student("Bob", 85),
                new Student("Charlie", 75),
                new Student("Dave", 90)
        };

        int value = 75;
        printNames(value, students);
    }

    static void printNames(int value, Student ... array){
        for (Student student : array) {
            if (student.getGrade() == value) {
                System.out.println(student.getName());
            }
        }
    }
}

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + name + "," + grade + "}";
    }
    public static void main(String[] args) {
        Student student = new Student("Bob", 34);
        System.out.println(student);
    }
}

