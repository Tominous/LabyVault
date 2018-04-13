package de.daddyplay.labyvault.event;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import de.daddyplay.labyvault.Main;
import net.labymod.api.events.ServerMessageEvent;

public class MoneyMessageEvent implements ServerMessageEvent {
    @Override
    public void onServerMessage(String messageKey, JsonElement serverMessage) {
        // Checking whether the message is intended to update the points and whether the JSON message is a JSON object
        if (messageKey.equals("money") && serverMessage.isJsonObject()) {
            JsonObject pointsObject = serverMessage.getAsJsonObject();

            // Checking whether a points attribute is included
            if (pointsObject.has("money")) {
                // Getting the value of the points attribute
                int points = pointsObject.get("money").getAsInt();

                // Setting the points
                Main.getMain().money = points;

            }
        }
    }
}
