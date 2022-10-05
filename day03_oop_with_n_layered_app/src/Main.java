import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateProductDao;
import dataAccess.ProductDao;
import entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1, "iPhone XR", 10000);
        ProductDao productDao = new HibernateProductDao();
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        ProductManager productManager = new ProductManager(productDao, loggers);
        productManager.add(product);
    }
}