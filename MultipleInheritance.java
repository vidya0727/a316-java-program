interface Academic {
    void displayAcademicDetails();
}

interface Sports {
    void displaySportsDetails();
}

class Student implements Academic, Sports {
    String name;
    int marks;
    String sport;

    Student(String name, int marks, String sport) {
        this.name = name;
        this.marks = marks;
        this.sport = sport;
    }

    public void displayAcademicDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
    }

    public void displaySportsDetails() {
        System.out.println("Sport : " + sport);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Student student =
            new Student("vidya", 98, "Badminton");

        student.displayAcademicDetails();
        student.displaySportsDetails();
    }
}