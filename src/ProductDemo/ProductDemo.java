package ProductDemo;

import java.io.Serializable;

public class ProductDemo {

    public static void main(String[] args) {
        String f = "C:\\Users\\postl\\OneDrive\\Dokumente\\Wirtschaftsinformatik\\2. Semester\\Erweiterte Themen der Softwareentwicklung\\sub-ordner\\dokumente\\ProductDemo.dat";
        //String g = "C:\\Users\\postl\\OneDrive\\Dokumente\\Wirtschaftsinformatik\\2. Semester\\Erweiterte Themen der Softwareentwicklung\\sub-ordner\\dokumente\\ProductDemoLoad.dat";

        ProductManager asdf = new ProductManager();
        Product schnitzel = new Product("Wiener", 13.5, "Fleisch");
        Product doener = new Product("Döner", 3.5, "Fleisch");

        asdf.add(schnitzel);
        asdf.add(doener);
        asdf.save(f);

        asdf.load(f);
        asdf.print();

    }
}
