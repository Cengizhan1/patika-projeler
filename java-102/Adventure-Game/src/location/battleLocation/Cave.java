package location.battleLocation;

import model.monster.Zombie;
import model.player.Player;

public class Cave extends BattleLocation {
    public Cave(Player player) {
        super(player, new Zombie());
    }

    @Override
    public boolean itemControl() {
        return getPlayer().hasFood;
    }

    @Override
    public void getReward() {
        if (getPlayer().getCharacter().getHealth() > 0) getPlayer().hasFood = true;
        System.out.println("You Have Collected Food!");
    }
}