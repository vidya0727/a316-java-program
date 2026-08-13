import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();

        System.out.println("First name: " + name1);
        System.out.println("Second name: " + name2);

        if (name1.equals(name2)) {
            System.out.println("Both employee names are the same.");
        } else {
            System.out.println("Employee names are different.");
        }

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are the same ignoring case.");
        } else {
            System.out.println("Names are different even ignoring case.");
        }

        System.out.println("Length of first name: " + name1.length());
        System.out.println("Length of second name: " + name2.length());

        sc.close();
    }
}