package Classes;

// Класс с поведением  вип клиента
// У которого есть свой сип ID
public class SpecialClient extends Actor {
  private int idVIP;

  public SpecialClient(String name, int idVIP) {
    super(name);
    this.idVIP = idVIP;
  }

  public int getId() {
    return idVIP;
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
