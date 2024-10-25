package src.useFile;

public class MainFile {
    public static void main(String[] args) {

        FileControl fileControl = new FileControl("system");
        fileControl.createFile();
        //fileControl.deleteFile();
    }
}
