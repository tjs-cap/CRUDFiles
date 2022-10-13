import java.io.File;
import java.io.IOException;

public class CreatingAFile {
    public static void main(String[] args) throws IOException {
        File f = new File("file.txt");
        if(f.exists()){
            System.out.println("This file does exist!");
        }
        else {
            if (f.createNewFile()){
                System.out.println("File created!");
            }
            else {
                System.out.println("Error in creating file.");
            }
        }
    }
}
