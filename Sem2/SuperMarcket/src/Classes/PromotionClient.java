package Classes;

// Класс с акционным клиентом
public class PromotionClient extends Actor {

    private Integer idPromotionClient; // ID клиента
    public String namePromition; // Название акции
    public static Integer countClient; // Количество акционных клиентов (статическое поле)

    public PromotionClient(String name, Integer idPromotionClient, String namePromition) {
        super(name);
        this.idPromotionClient = idPromotionClient;
        this.namePromition = namePromition;
    }

    public Integer getIdPromotionClient() {
        return idPromotionClient;
    }

    public String getNamePromition() {
        return namePromition;
    }

    public void setNamePromition(String namePromition) {
        this.namePromition = namePromition;
    }

    public static Integer getCountClient() {
        return countClient;
    }

    public static void setCountClient(Integer countClient) { // Не понятно пока как работает...
        PromotionClient.countClient = countClient;
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
