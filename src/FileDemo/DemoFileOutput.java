package FileDemo;

import java.io.*;

public class DemoFileOutput {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\postl\\OneDrive\\Dokumente\\Wirtschaftsinformatik\\2. Semester\\Erweiterte Themen der Softwareentwicklung\\sub-ordner\\dokumente\\demo20230717.txt");

        try (FileOutputStream fos = new FileOutputStream(f)) {

            String demo = new String("Wir haben die Intensivwoche ab 21:30 hinter uns :-)\n");
            char[] arrayOfChars = demo.toCharArray();
            for (char c : arrayOfChars) {
                fos.write((int) c);
                fos.flush();
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
