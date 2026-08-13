import java.util.Scanner;

class SalesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] sales = new double[12];

        System.out.println("Enter sales for 12 months:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            sales[i] = sc.nextDouble();
        }

        double maximum = sales[0];
        double minimum = sales[0];

        for (int i = 1; i < 12; i++) {
            if (sales[i] > maximum) {
                maximum = sales[i];
            }

            if (sales[i] < minimum) {
                minimum = sales[i];
            }
        }

        System.out.println("Highest Sales: " + maximum);
        System.out.println("Lowest Sales: " + minimum);

        sc.close();
    }
}