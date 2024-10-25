package src.useFile;

import java.io.File;
import java.time.LocalDate;

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

}
