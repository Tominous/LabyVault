package de.daddyplay.labyvault;

import de.daddyplay.labyvault.event.MessageEvent;;
import de.daddyplay.labyvault.event.PlayerQuit;
import de.daddyplay.labyvault.module.JobModule;
import de.daddyplay.labyvault.module.LabyVaultModuleCategory;
import de.daddyplay.labyvault.module.VaultmoneyModule;
import net.labymod.api.LabyModAddon;
import net.labymod.ingamegui.ModuleCategoryRegistry;
import net.labymod.settings.elements.SettingsElement;

import java.util.List;

public class Main extends LabyModAddon {
    public static Main main = null;
    public static VaultmoneyModule vaultMoney;
    public static JobModule jobModule;
    public static UserData userData = new UserData();

    @Override
    public void onEnable() {
        main = this;
        vaultMoney = new VaultmoneyModule();
        jobModule = new JobModule();
        this.getApi().getEventManager().registerOnQuit(new PlayerQuit());
        this.getApi().getEventManager().register(new MessageEvent());
        this.getApi().registerModule(vaultMoney);
        this.getApi().registerModule(jobModule);
        ModuleCategoryRegistry.loadCategory(new LabyVaultModuleCategory());

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
