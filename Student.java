public class Student {
    private int id;
    private String fullname;
    private int grade;

    public Student() {}

    public Student(int id, String fullname, int grade) {
        this.id = id;
        this.fullname = fullname;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ",fullname=" + fullname + ",grade=" + grade + "}";
    }
}

import java.util.Arrays;

public class StudentHouse {
    private int capacity;
    private Student[] students;

    public StudentHouse(int capacity) {
        this.capacity = capacity;
        this.students = new Student[capacity];
    }

    boolean addStudent(Student student) {
        for (int i = 0; i < capacity; i++) {
            if (students[i] == null) {
                students[i] = student;
                return true;
            }
        }
        return false;
    }

    void deleteStudent(int id) {
        for (int i = 0; i < capacity; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null;
                break;
            }
        }
    }

    void printStudents() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    Student theBestStudent() {
        Student bestStudent = null;
        for (Student student : students) {
            if (student != null && (bestStudent == null || student.getGrade() > bestStudent.getGrade())) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }

    int getAverageGrade() {
        int sum = 0;
        int count = 0;
        for (Student student : students) {
            if (student != null) {
                sum += student.getGrade();
                count++;
            }
        }
        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }
}

public class StudentHouseTest {
    public static void main(String[] args) {
        StudentHouse house = new StudentHouse(3);

        Student s1 = new Student(1, "Алиска", 85);
        Student s2 = new Student(2, "Ильдар", 90);
        Student s3 = new Student(3, "Кузя", 80);

        house.addStudent(s1);
        house.addStudent(s2);
        house.addStudent(s3);

        house.printStudents();

        System.out.println("Best student: " + house.theBestStudent());
        System.out.println("Average grade: " + house.getAverageGrade());

        house.deleteStudent(2);
        house.printStudents();
    }
}
