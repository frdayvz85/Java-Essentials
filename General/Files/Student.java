package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String fileUrl = "D:\\Master Lessons\\2 semester\\Java\\Lab\\FromInternet\\General\\Files";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileUrl + "\\" + args[0]));
            Scanner scanner = new Scanner(System.in);
            // System.out.println("Enter student name");

            // writer.write("Studnets;");
            for (int i = 0; i < 5; i++) {
                writer.write("\n" + scanner.nextLine());
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
