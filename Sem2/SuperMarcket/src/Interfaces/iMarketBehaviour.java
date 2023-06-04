package Interfaces;

import java.util.List;

import Classes.Actor;

// Поведение прихода и ухода

public interface iMarketBehaviour {

    void acceptToMarket(iActorBehaviour actor); // Пришел в маркет

    void releaseFromMarket(List<Actor> actors); // Ушел из маркета

    void update(); 
}
