import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter myWriter = new FileWriter("example.txt");
            myWriter.write("This lesson is soooo coool!");
            myWriter.close();
            System.out.println("Information saved!");
        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
