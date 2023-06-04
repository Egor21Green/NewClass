package Interfaces;

import Classes.Actor;

// Интерфейс поведения клиентов
public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder); // Берет товар 
    void setTakeOrder(boolean pickUpOrder);  // Отдает товар 
    boolean isMakeOrder(); // Берет товар (да, нет)
    boolean isTakeOrder(); // Отдает товар (да, нет)
    Actor getActor(); // Вывод
    void returnOrder(); // Клиент возвращает товар
    void getNamberOrder(); // Количество возвращаеммых товаров
    void returnMoney(); // Возврат денег
    void getReasonForReturn(); // Причина возврата товара
}
