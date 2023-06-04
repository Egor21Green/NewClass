package Interfaces;
// Интерфейс на возврат товара

public interface iReturnOrder {
    void returnOrder(); // Клиент возвращает товар
    void getNamberOrder(); // Количество возвращаеммых товаров
    void returnMoney(); // Возврат денег
    void getReasonForReturn(); // Причина возврата товара
}
