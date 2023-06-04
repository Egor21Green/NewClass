package Interfaces;

import Classes.Actor;

/**
 * Поведение
 * клиентов в маркете
 */
public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor); // Клиент встал в очередь

    void releaseFromQueue(); // Клиент покинул очередь

    void takeOrder(); // Берет товар

    void giveOrder(); // Отдает товар
}
