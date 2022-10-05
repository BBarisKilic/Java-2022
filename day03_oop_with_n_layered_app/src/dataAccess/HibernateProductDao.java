package dataAccess;

import entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product) {
        System.out.println("Hibernate ile veritabanina eklendi: " + product.getName());
    }
}
