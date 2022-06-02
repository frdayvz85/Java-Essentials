package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] names = { "Farid", "Nizami", "Shamil" };
        String fileUrl = "D:\\Master Lessons\\2 semester\\Java\\Lab\\FromInternet\\General\\Files\\output.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileUrl));
            writer.write("My name is Farid");
            writer.write("\nI am learning JAVA");
            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.write("\nWelcome to the Learning center");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // read the file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileUrl));
            System.out.println(reader.readLine()); // single line

            // All the information from the file
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
