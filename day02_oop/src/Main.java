public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();

        // Set
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(2);
        product1.setImageUrl("random.png");

        // Get
        // System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(2);
        product2.setImageUrl("random.png");

        Product product3 = new Product();
        product3.setName("Kıtchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(4);
        product3.setImageUrl("random.png");

        Product[] products = {product1, product2, product3};

        for(Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0523444555444");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demirog");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setCustomerNumber("54321");
        corporateCustomer.setPhone("088900000000");
        corporateCustomer.setTaxNumber("11111111111");

        Customer[] customers = {individualCustomer, corporateCustomer};
    }
}