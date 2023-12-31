/**
* Этот интерфейс определяет поведение супермаркета.
*/

package Interfaces;

import java.util.List;

import Classes.Actor;

/** интерфейс Магазина */
public interface iMarketBehaviour {
    /** клиент вошел в магазин */
    void acceptToMarket(iActorBehaviour actor);

    /** клиент покинул магазин */
    void releaseFromMarket(List<Actor> actors);

    void update();
}