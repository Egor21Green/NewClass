package Domen;

public class BottleP extends Product {

    private int volume;

    /**
     * Create a produtc for VM
     * 
     * @param productId   id product
     * @param productName
     * @param productCategory
     * @param price
     */
    public BottleP(int productId, String productName, String productCategory, double price, int volume ) {
        super(productId, productName, productCategory, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString(){
        return "Product{" + "name" + super.getProductName() + '\'' + "category =" + super.getProductCategory() + '\''  +
        ", cost=" + super.getPrice() + ", volume=" + volume + '}';
    
}
}
