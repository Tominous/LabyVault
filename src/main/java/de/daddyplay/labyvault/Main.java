package de.daddyplay.labyvault;

import de.daddyplay.labyvault.event.MoneyMessageEvent;
import de.daddyplay.labyvault.event.PlayerJoin;
import de.daddyplay.labyvault.event.PlayerQuit;
import de.daddyplay.labyvault.module.VaultMoney;
import de.daddyplay.labyvault.module.VaultmoneyModule;
import net.labymod.api.LabyModAddon;
import net.labymod.ingamegui.ModuleCategoryRegistry;
import net.labymod.settings.elements.SettingsElement;

import java.util.List;

public class Main extends LabyModAddon {
    public static int money = 0;
    public static Main main = null;
    public static VaultmoneyModule vaultMoney;

    @Override
    public void onEnable() {
        main = this;
        vaultMoney = new VaultmoneyModule();
        this.getApi().getEventManager().registerOnJoin(new PlayerJoin());
        this.getApi().getEventManager().registerOnQuit(new PlayerQuit());
        this.getApi().getEventManager().register(new MoneyMessageEvent());
        this.getApi().registerModule(vaultMoney);
        ModuleCategoryRegistry.loadCategory(new VaultMoney());
    }

    @Override
    public void onDisable() {
    }

    @Override
    public void loadConfig() {
    }

    @Override
    protected void fillSettings(List<SettingsElement> list) {
    }

    public static Main getMain() {
        return main;
    }

}
