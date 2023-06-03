package Domen;

public class HotDrink extends Product {

    public int temperature;

    /**
     * Create a produtc for VM
     * 
     * @param productId       id product
     * @param productName     name product
     * @param productCategory it is category product
     * @param price           it is price product
     * @param temperature     new param product
     */

    public HotDrink(int productId, String productName, String productCategory, double price,
            int temperature) {
        super(productId, productName, productCategory, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;

    }

    @Override
    public String toString() {
        return "Product № " + super.getProductId() + " {" + "name = " + super.getProductName() + ", category = " + super.getProductCategory() +
                ", price = " + super.getPrice() + ", temperature = " + temperature + '}';

    }

}
