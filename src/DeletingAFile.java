import java.io.File;

public class DeletingAFile {
    public static void main(String[] args) {
        File f = new File("example.txt");
        if (f.delete()){
            System.out.println("Delete the file " + f.getName());
        } else {
            System.out.println("Failed to delete file.");
        }
    }
}
