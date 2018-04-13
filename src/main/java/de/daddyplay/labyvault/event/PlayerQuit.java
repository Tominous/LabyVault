package de.daddyplay.labyvault.event;

import de.daddyplay.labyvault.Main;
import net.labymod.utils.Consumer;
import net.labymod.utils.ServerData;

public class PlayerQuit implements Consumer<ServerData> {
    @Override
    public void accept(ServerData serverData) {
        if(Main.vaultMoney.isShown()){
            Main.money = 0;
        }
    }
}
