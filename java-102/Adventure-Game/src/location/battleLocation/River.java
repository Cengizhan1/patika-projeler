package location.battleLocation;

import model.monster.Bear;
import model.player.Player;

public class River extends BattleLocation {
    public River(Player player) {
        super(player, new Bear());
    }

    @Override
    public boolean itemControl() {
        return getPlayer().hasWater;
    }

    @Override
    public void getReward() {
        if (getPlayer().getCharacter().getHealth() > 0) getPlayer().hasWater = true;
        System.out.println("You Have Collected Water!");
    }
}