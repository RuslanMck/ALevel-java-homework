package fighters.base;

import myException.DragonCaughtExc;

import java.util.zip.DataFormatException;

public interface PreFightActions {
    void actionWithFight(BaseFighter fighter) throws DragonCaughtExc;

    default void setFullHP(BaseFighter fighter) {
        fighter.setHealth(fighter.getFullHP());
    }
}