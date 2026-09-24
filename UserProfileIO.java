import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserProfileIO {
    public static void main(String[] args) {

        String fileName = "profile.txt";

        String profile =
                "Name: Rahul\n" +
                "Age: 21\n" +
                "Email: rahul@gmail.com\n" +
                "Fitness Goal: Weight Loss\n";

        // Writing data to the file
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
s
            byte[] data = profile.getBytes();
            fos.write(data);

            System.out.println("Profile data written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        // Reading data from the file
        try (FileInputStream fis = new FileInputStream(fileName)) {

            int ch;

            System.out.println("\nUser Profile:");

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}
