package Classes;

// Абстрактный класс клиента
// С основным его поведением
import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;


public abstract class Actor implements iActorBehaviour, iReturnOrder {  // Подключаю интерфейс возврата товара
    protected String name;
    protected boolean isTakeOrder; 
    protected boolean isMakeOrder;

    public Actor( String name) {
        this.name = name;
    }

    public abstract String getName(); 
       
}
