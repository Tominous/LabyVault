package de.daddyplay.labyvault.event;


import com.google.gson.JsonObject;

import de.daddyplay.labyvault.Main;
import net.labymod.utils.Consumer;
import net.labymod.utils.ServerData;


public class PlayerJoin implements Consumer<ServerData> {
    @Override
    public void accept(ServerData serverData) {
        JsonObject optionsObject = new JsonObject();
        optionsObject.addProperty("status", true);

        Main.getMain().getApi().sendJsonMessageToServer("login-status", optionsObject);
    }
}
