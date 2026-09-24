public class StudentDetails {

    public void displayInfo() {
        System.out.println("Student Name: Rahul");
        System.out.println("Roll Number: 101");
        System.out.println("Course: Computer Science");
    }

    public static void main(String[] args) {

        StudentDetails student = new StudentDetails();

        student.displayInfo();
    }
}
