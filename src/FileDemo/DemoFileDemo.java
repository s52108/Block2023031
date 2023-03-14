package FileDemo;

import java.io.File;

import static FileDemo.DemoFile.printAndGetSize;

public class DemoFileDemo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\postl\\OneDrive\\Dokumente\\Wirtschaftsinformatik\\2. Semester\\Erweiterte Themen der Softwareentwicklung\\sub-ordner");
        System.out.println("printAndGetSize(f) = " + printAndGetSize(f));
    }
}
