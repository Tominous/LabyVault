package de.daddyplay.labyvault.module;
import de.daddyplay.labyvault.Main;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.moduletypes.SimpleModule;
import net.labymod.settings.elements.ControlElement;
import net.labymod.utils.Material;

public class VaultmoneyModule extends SimpleModule {
    @Override
    public String getDisplayName() {
        return "Money";
    }

    @Override
    public String getDisplayValue() {
        return "" + Main.money;
    }

    @Override
    public String getDefaultValue() {
        return null;
    }

    @Override
    public ControlElement.IconData getIconData() {
        return new ControlElement.IconData(Material.EMERALD);
    }

    @Override
    public void loadSettings() {

    }

    @Override
    public String getSettingName() {
        return "Money";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public int getSortingId() {
        return 0;
    }

    @Override
    public ModuleCategory getCategory() {
        return new VaultMoney();
    }
}