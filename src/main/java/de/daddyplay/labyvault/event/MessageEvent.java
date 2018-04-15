package de.daddyplay.labyvault.event;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import de.daddyplay.labyvault.Main;
import net.labymod.api.events.ServerMessageEvent;

public class MessageEvent implements ServerMessageEvent {
    @Override
    public void onServerMessage(String messageKey, JsonElement serverMessage) {
        if (messageKey.equals("money") && serverMessage.isJsonObject()) {
            JsonObject pointsObject = serverMessage.getAsJsonObject();

            if (pointsObject.has("money")) {
                int points = pointsObject.get("money").getAsInt();

                Main.getMain().money = points;

            }
        } else if (messageKey.equals("labyvault-status") && serverMessage.isJsonObject()) {
            JsonObject jsonObject = serverMessage.getAsJsonObject();
            if (jsonObject.has("labyvault-server")) {
                if (jsonObject.get("labyvault-server").getAsBoolean()) {

                    JsonObject optionsObject = new JsonObject();
                    optionsObject.addProperty("labyvault-client", true);

                    Main.getMain().getApi().sendJsonMessageToServer("labyvault", optionsObject);
                }
            }

        }
    }
}
