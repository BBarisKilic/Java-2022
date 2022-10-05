package business;

import core.logging.Logger;
import dataAccess.JdbcProductDao;
import dataAccess.ProductDao;
import entities.Product;


public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception{
        // business rules
        if(product.getUnitPrice()<10) {
            throw new Exception("Ürün fiyati 10'dan kücük olamaz.");
        }

        productDao.add(product);

        for (Logger logger: loggers) {
            logger.log(product.getName());
        }
    }
}
