import Domen.BottleP;
import Domen.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays","Чипсы", 59);
        Product item2 = new BottleP(2, "Kola", "Water",10   , 2);
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(item2);
        
        for (Product prod: iMachine.getProducts())
        {
            System.out.println(prod.toString());
        }
    }
}
