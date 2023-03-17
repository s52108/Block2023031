package FileInAndOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleInAndOutput {

    public ConsoleInAndOutput() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\postl\\OneDrive\\Dokumente\\Wirtschaftsinformatik\\2. Semester\\Erweiterte Themen der Softwareentwicklung\\sub-ordner\\dokumente\\demo20230317.txt");

        int byteRead;
        try (FileOutputStream fos = new FileOutputStream(f)) {
            while ((byteRead = System.in.read()) != 'x') {
                fos.write(byteRead);
            }
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Es kam ein x");
        }


    }


}

