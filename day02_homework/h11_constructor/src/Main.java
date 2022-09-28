public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", "Asus Laptop", 5000, 3);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Laptop");
        product2.setDescription("MSI Laptop");
        product2.setPrice(6000);
        product2.setStockAmount(8);

        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        productManager.add(product2);
    }
}