package src.useFile;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class FileControl {

    private File file;

    public FileControl() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        String date = day + "-" + month + "-" + year;
        date = date+".txt";
        file = new File(date);
    }

    public FileControl( String filePath ) {
        filePath = filePath + ".txt";
        file = new File(filePath);
    }

    public void createFile() {
        try {
            file.createNewFile();
        }catch (Exception e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }

    public void deleteFile() {
        file.delete();
    }

    public void writeToFile(String line) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(line + System.lineSeparator());
            fileWriter.close();
        }catch (Exception ex) {
            System.err.println("Error writing to file: " + ex.getMessage());
        }
    }

    public void readFromFile() {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (Exception e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }


}
