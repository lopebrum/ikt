import java.util.Comparator;

public class CompGrade implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGrade(), o2.getGrade());
    }
}

public class CompGradeId implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int gradeComparison = Integer.compare(o1.getGrade(), o2.getGrade());
        if (gradeComparison != 0) {
            return gradeComparison;
        }
        return Integer.compare(o1.getId(), o2.getId());
    }
}

public class CompId implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

public class CompName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullname().compareTo(o2.getFullname());
    }
}

import java.util.Comparator;

public class CompNameLength implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getFullname().length(), o2.getFullname().length());
    }
}

import java.util.ArrayList;
        import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Асылбек", 85));
        students.add(new Student(2, "Болат", 90));
        students.add(new Student(3, "Гульмира", 80));
        students.add(new Student(4, "Данияр", 90));
        students.add(new Student(5, "Ержан", 85));

        Collections.sort(students, new CompGrade());
        Collections.sort(students, new CompGradeId());
        Collections.sort(students, new CompId());
        Collections.sort(students, new CompName());
        Collections.sort(students, new CompNameLength());
    }
}

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
