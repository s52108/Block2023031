package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("C:\\Users\\postl\\OneDrive\\Dokumente\\Wirtschaftsinformatik\\2. Semester\\Erweiterte Themen der Softwareentwicklung\\sub-ordner\\dokumente\\IO.txt"); PrintWriter pw = new PrintWriter(fw)) {
            pw.println("Zeile 1");
            pw.println("Zeile 2");
            pw.println("Zeile 3");
            pw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
