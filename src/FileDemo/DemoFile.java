package FileDemo;

import java.io.File;

public class DemoFile {
    public static long printAndGetSize(File f) {
        if (f.isFile()) {
            System.out.println(f.getName() + " | " + f.length());
            return f.length();
        }

        long result = 0;

        for (File files : f.listFiles()) {
            System.out.println(files.getName() + " | " + files.length());
            result += files.length();

            if (files.isDirectory()) {
                result += printAndGetSize(files);
            }

        }
        return result;

    }
}
