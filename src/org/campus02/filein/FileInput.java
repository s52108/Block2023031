package org.campus02.filein;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\postl\\OneDrive\\Dokumente\\Wirtschaftsinformatik\\2. Semester\\Erweiterte Themen der Softwareentwicklung\\sub-ordner\\dokumente\\demo.txt");

        if (!file.exists()) {
            System.out.println("Datei existiert nicht.");
            return;
        }
        // if-Abfrage
        int count = 0;

        try {
            FileInputStream fis = new FileInputStream(file);
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                count++;
                char[] chars = Character.toChars(byteRead);
                System.out.println("chars[" + count + "] = " + chars[0]);
            }

            System.out.println(count);
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
