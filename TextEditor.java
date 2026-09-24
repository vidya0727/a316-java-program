import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor {

    public static void main(String[] args) {

        String fileName = "document.txt";

        String content =
                "Welcome to Java File Handling.\n" +
                "This is a text editor application.\n" +
                "FileWriter writes and FileReader reads the file.";

        // Write content to file
        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write(content);

            writer.close();

            System.out.println("Content written successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Read content from file
        try {
            FileReader reader = new FileReader(fileName);

            int ch;

            System.out.println("\nFile Content:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
