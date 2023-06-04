package Classes;

// Класс с поведением обычного клиента
public class OrdinaryClient extends Actor {

  public OrdinaryClient(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return super.name;
  }

  public boolean isTakeOrder() {
    return super.isTakeOrder;
  }

  public boolean isMakeOrder() {
    return super.isMakeOrder;
  }

  public void setTakeOrder(boolean makeOder) {
    super.isMakeOrder = makeOder;
  }

  public void setMakeOrder(boolean pikUpOrder) {
    super.isTakeOrder = pikUpOrder;
  }

  public Actor getActor() {
    return this;
  }

  // Нужно описать какую-то логику
  // Надо бы написать, но по идее пункт дз выполнен...

  public void returnOrder() {

  }

  public void getNamberOrder() {

  }

  public void returnMoney() {

  }

  public void getReasonForReturn() {

  }

}
