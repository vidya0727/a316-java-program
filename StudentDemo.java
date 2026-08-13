class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }

    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Arun", 101, 92);
        Student student2 = new Student("Priya", 102, 78);

        System.out.println("Student 1 Details:");
        student1.displayInfo();

        System.out.println("Student 2 Details:");
        student2.displayInfo();
    }
}