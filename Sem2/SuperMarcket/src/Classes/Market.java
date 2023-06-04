package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;


/** Основной класс маркет,
 * в котором происходят все действия
 */
public class Market implements iMarketBehaviour,iQueueBehaviour {

    private List<iActorBehaviour> queue; 

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>(); // Конструктор создания очереди клиентов (список)
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {  // Перегрузка метода из интерфейса
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин "); // клиент приходит в маркет
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {   // Перегрузка метода из интерфейса
        this.queue.add(actor);                         //  клиент добавлен в очередь (в список)
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {     // Перегрузка метода из интерфейса
        for(Actor actor:actors)                             //  клиент исключен из очереди (из списока)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }

    @Override
    public void update() {  // Не особо понимаю зачем это...
       takeOrder();         // Перегрузка поведения клиентов или чтото типо этого
       giveOrder();
       releaseFromQueue();
    }
    // И дальше идет перегрузка всех этих методов (поведения клиентов)
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }

    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors);
    }



    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }
 
}
