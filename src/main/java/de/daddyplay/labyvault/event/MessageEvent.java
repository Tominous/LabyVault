package de.daddyplay.labyvault.event;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import de.daddyplay.labyvault.Main;
import net.labymod.api.LabyModAPI;
import net.labymod.api.events.ServerMessageEvent;
import net.labymod.core.LabyModCore;
import net.labymod.core.asm.LabyModCoreMod;
import net.labymod.ingamegui.enums.EnumDisplayType;
import net.labymod.main.LabyMod;
import net.minecraftforge.common.MinecraftForge;

import java.util.Iterator;
import java.util.Set;

public class MessageEvent implements ServerMessageEvent {
    @Override
    public void onServerMessage(String messageKey, JsonElement serverMessage) {
        JsonObject jsonserverMessage = serverMessage.getAsJsonObject();

        switch (messageKey.toLowerCase()) {

            case "labyvault-status":
                if (jsonserverMessage.has("labyvault-server")) {
                    if (jsonserverMessage.get("labyvault-server").getAsBoolean()) {

                        JsonObject optionsObject = new JsonObject();
                        optionsObject.addProperty("labyvault-client", true);

                        Main.getMain().getApi().sendJsonMessageToServer("labyvault", optionsObject);
                    }
                    break;
                }
                break;

            case "money":
                if (jsonserverMessage.has("money")) {
                    int points = jsonserverMessage.get("money").getAsInt();

                    Main.userData.setMoney(points);
                    break;
                }
                break;

            case "job":
                if (jsonserverMessage.has("jobs")) {
                    JsonObject jsonObject = serverMessage.getAsJsonObject().getAsJsonObject("jobs");
                    String[] jobs = new String[jsonObject.size()];
                    String[] level = new String[jsonObject.size()];
                    for (int i = 0; i < jsonObject.size(); i++) {
                        JsonObject jobsjson = (JsonObject) jsonObject.get((i + 1) + "");
                        jobs[i] = jobsjson.get("name").getAsString();
                        level[i] = jobsjson.get("level").getAsString();
                    }
                    Main.userData.setLevel(level);
                    Main.userData.setJobs(jobs);
                    break;
                }
                break;
        }
    }
}
