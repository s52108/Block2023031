package ProductDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<Product> product = new ArrayList<>();

    public void add(Product p) {
        product.add(p);
    }

    public void save(String path) {


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {

            for (Product p : product) {
                oos.writeObject(p);
            }
            oos.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void load(String path) {

    }
}
